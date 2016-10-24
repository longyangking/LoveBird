package material;

/**
 * This class defines the basic optical properties of the common materials
 * @author longyang
 *
 */
public class ConstantOpticalParameter {
	private double eps, mu;
	/**
	 * Define a material in which the epsilon will be a specific value without the consideration of loss
	 * @param Epsreal the value of epsilon
	 */
	public ConstantOpticalParameter(double eps){
		this.eps = eps; this.mu = 1;
	}
	/**
	 * Define a material with specific epsilon and mu
	 * @param eps Epsilon
	 * @param mu Mu
	 */
	public ConstantOpticalParameter(double eps, double mu){
		this.eps = eps; this.mu = mu;
	}
	/**
	 * Get epsilon of material
	 * @return Epsilon
	 */
	public double getEpsilon(){
		return this.eps;
	}
	/**
	 * Get Mu of material
	 * @return Mu
	 */
	public double getMu(){
		return this.mu;
	}
	/**
	 * Set Epsilon of material
	 * @param eps Epsilon
	 */
	public void setEpsilon(double eps){
		this.eps = eps;
	}
	/**
	 * Set Mu of material
	 * @param mu Mu
	 */
	public void setMu(double mu){
		this.mu = mu;
	}
}
