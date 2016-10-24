package mesh;

public abstract class Mesh {
	int Nx, Ny, Nz;
	int Accuracy;
	/**
	 * Adapt the initial mesh to higher accuracy
	 * @param accuracy The specific accuracy
	 */
	public abstract void adaption(int accuracy);
	/**
	 * Evaluate the quality of the current mesh
	 * @return the quality
	 */
	public abstract double evaluation();
}
