package script;

public class Lexer {
	private String script;
	
	public Lexer(String str){
		this.script = str;
	}
	
	public Token getNextToken() throws IllegalExpression{
		// TODO Definitely, this function will be tremendously big
		return new Token("");
	}

}
