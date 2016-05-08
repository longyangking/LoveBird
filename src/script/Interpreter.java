package script;

public class Interpreter {
	private Lexer lexer;
	private Token currentToken;
	
	public Interpreter(Lexer lexer) throws IllegalExpression {
		this.lexer = lexer;
		this.currentToken = this.lexer.getNextToken();
	}

	private void error() throws IllegalExpression {
		throw new IllegalExpression("Invalid Syntax!");
	}
	
	private void eat(Token.Type type) throws IllegalExpression {
		if (this.currentToken.getType() == type){
			this.currentToken = this.lexer.getNextToken();
		} else {
			this.error();
		}
	}
	
	// TODO to return int is just a temp solution
	private int factor() throws IllegalExpression {
		Token token = this.currentToken;
		if (token.getType() == Token.Type.INTEGER){
			this.eat(Token.Type.INTEGER);
			return Integer.parseInt(token.getValue());
		} else{
			if (token.getType() == Token.Type.LP){
				this.eat(Token.Type.LP);
				int result = this.execute();
				this.eat(Token.Type.RP);
				return result;
			}
		}
		this.error();
		return 0;
	}
	
	private int term() throws IllegalExpression {
		int result = this.factor();
		while ((this.currentToken.getType() == Token.Type.MUL)||(this.currentToken.getType() == Token.Type.DIV)){
			if (this.currentToken.getType() == Token.Type.MUL){
				this.eat(Token.Type.MUL);
				result = result*this.factor();
				continue;
			} 
			if (this.currentToken.getType() == Token.Type.DIV){
				this.eat(Token.Type.DIV);
				result = result/this.factor();
				// TODO may cause divide by Zero Error...
				continue;
			}
		}
		return result;
	}
	
	public int execute() throws IllegalExpression {
		int result = this.term();
		while ((this.currentToken.getType() == Token.Type.PLUS)||
				(this.currentToken.getType() == Token.Type.MINUS)){
			if (this.currentToken.getType() == Token.Type.PLUS){
				this.eat(Token.Type.PLUS);
				result = result + this.term();
				continue;
			}
			if (this.currentToken.getType() == Token.Type.MINUS){
				this.eat(Token.Type.MINUS);
				result = result - this.term();
				continue;
			}
		}
		return result;
	}

}
