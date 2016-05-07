package config;

/**
 * This class will contain the settings in LoveBird
 * The content here will be variant with the modification from Users
 * @author longyang
 *
 */
public class SystemSettings {
	//Info of local cores for computation
	private static int LocalCore = 1; // The number of cores for computation
	private static final int LocalCoreMax;  // The max number of cores for computation
	static {
		// TODO Initiate ComputationCoreMax
		LocalCoreMax = 16;
	}
	/**
	 * Get the number of core for computation
	 * @return Number of core
	 */
	public static int getLocalCore(){
		return LocalCore;
	}
	/**
	 * Set the number of core for computation
	 * @param num Number of core
	 */
	public static void setLocalCore(int num){
		LocalCore = num > LocalCoreMax? LocalCoreMax:num;
	}
	/**
	 * Get the max number of core we can use
	 * @return Max number of core
	 */
	public static int getLocalCoreMax(){
		return LocalCoreMax;
	}
	
	//Info of remote cores for computation
	private static int RemoteCore = 0;
	public static int getRemoteCore(){
		return RemoteCore;
	}
	public static void setRemoteCore(int num){
		// TODO To increase remote core must involve the parallel mechanism.
		RemoteCore = num;
	}
	
	
}
