package script;

/**
 * This class will deal with any tasks came from script
 * @author longyang
 *
 */
public class Script {
	public static void execute(String str) throws IllegalExpression {
		Interpreter interpreter = new Interpreter(new Lexer(str));
		interpreter.execute();	
	}
}
