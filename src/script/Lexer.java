package script;

public class Lexer {
	
	private String script;
	private int pos;
	private char currentChar;
	
	public Lexer(String script){
		this.script = script;
		this.pos = 0;
		if (script.isEmpty()){
			this.currentChar = Token.None;
		} else {
			this.currentChar = this.script.charAt(pos);
		}
	}
	
	private void error() throws IllegalExpression{
		throw new IllegalExpression("Invalid Character!");
	}
	
	private void advance(){
		this.pos += 1;
		if (this.pos > this.script.length() - 1) {
			this.currentChar = Token.None;
		}else {
			this.currentChar = this.script.charAt(pos);
		}
	}
	
	private void skipWhitespace(){
		while ((Character.isWhitespace(this.currentChar))&&(this.currentChar != Token.None)) this.advance();
	}
	
	private String integer(){
		StringBuffer result = new StringBuffer();
		while ((Character.isDigit(this.currentChar))&&(this.currentChar != Token.None)) {
			result.append(this.currentChar);
			this.advance();
		}
		return result.toString();
	}
	
	/**
	 * Get the token from the lexer
	 * @return Token 
	 * @throws IllegalExpression Illegal Expression Found
	 */
	public Token getNextToken() throws IllegalExpression{
		// TODO Definitely, this function will be tremendously big
		while (this.currentChar != Token.None){
			if (Character.isWhitespace(currentChar)){
				this.skipWhitespace();
				continue;
			}
			if (Character.isDigit(currentChar)){
				return new Token(Token.Type.INTEGER,this.integer());
			}
			if (this.currentChar == '+'){
				this.advance();
				return new Token(Token.Type.PLUS,'+');
			}
			if (this.currentChar == '-'){
				this.advance();
				return new Token(Token.Type.MINUS,'-');
			}
			if (this.currentChar == '*'){
				this.advance();
				return new Token(Token.Type.MUL, '*');
			}
			if (this.currentChar == '/'){
				this.advance();
				return new Token(Token.Type.DIV, '/');
			}
			if (this.currentChar == '('){
				this.advance();
				return new Token(Token.Type.LP,'(');
			}
			if (this.currentChar == ')'){
				this.advance();
				return new Token(Token.Type.RP,')');
			}
			this.error();
		}
		return new Token(Token.Type.EOF,Token.None);
	}
}
