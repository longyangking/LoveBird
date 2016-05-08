package script;

/**
 * This class will deal with any tasks came from script
 * @author longyang
 *
 */
public class Script {
	// TODO this is just temp solution
	public static int Execute(String str) throws IllegalExpression {
		Interpreter interpreter = new Interpreter(new Lexer(str));
		return interpreter.execute();	
	}
}
