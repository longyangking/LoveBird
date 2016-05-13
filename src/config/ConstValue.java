package config;

/**
 * This class contains these physical constant values that are used most frequently. 
 * @author longyang
 *
 */
public class ConstValue {
	// TODO The specific value of these physical constants have not been written. 
	/**
	 * The permittivity of vacuum (unit: F/m)
	 */
	public static final double epsilon0 = 8.854187817*Math.pow(10, -12);
	/**
	 * The permeability of vacuum (unit: H/m)
	 */
	public static final double mu0 = 4*Math.PI*Math.pow(10, -7);
	/**
	 * The speed of light in vacuum (unit: m/s)
	 */
	public static final double c = 299792458;
	/**
	 * The wave impedance of vacuum (unit: V/A)
	 */
	public static final double eta0 = 377;
}
