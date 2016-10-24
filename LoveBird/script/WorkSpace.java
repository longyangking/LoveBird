package script;
import java.util.Hashtable;

/**
 * This class will maintain a hash table to hold on and update all variables during executing scripts
 * @author longyang
 *
 */
public class WorkSpace {
	private Hashtable<String,String> workspace;
	public WorkSpace(){
		workspace = new Hashtable<String,String>();
	}
	
	public void Insert(String key, String value){
		workspace.put(key, value);
	}
	
	public String Get(String key){
		return workspace.get(key);
	}
}
