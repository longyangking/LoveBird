package script;

public class IllegalExpression extends Exception{

	/**
	 * The UID for serialization of class
	 */
	private static final long serialVersionUID = 2675966915536344856L;
	
	private String errorMessage;
	
	public IllegalExpression(String info){
		this.errorMessage = info;
	}
	
	@Override
	public String toString(){
		return errorMessage;
	}
	
	public String getMessage(){
		return errorMessage;
	}
}
