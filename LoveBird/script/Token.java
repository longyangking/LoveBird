package script;

public class Token {
	/**
	 * Token Types
	 * @author longyang
	 *
	 */
	public static enum Type {
		INTEGER, PLUS, MINUS, MUL, DIV, LP, RP, EOF
	}
	public static final char None = '\0';
	
	private String value;
	private Type type;
	
	public String getValue() {
		return value;
	}

	public Type getType() {
		return type;
	}

	/**
	 * Create a Token
	 * @param type Type (Token.Type)
	 * @param value Value (String)
	 */
	public Token(Type type, String value){
		this.value = value;
		this.type = type;
	}
	
	/**
	 * Create a Token
	 * @param type Type (Token.Type)
	 * @param value Value (String)
	 */
	public Token(Type type, char value){
		this.value = String.valueOf(value);
		this.type = type;
	}
	
	@Override
	public String toString(){
		return String.format("Token({%s},{%s})", type.toString(),value); 
	}
}
