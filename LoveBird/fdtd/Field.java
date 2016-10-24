package fdtd;

public abstract class Field {
	Point[][][] points;
	int Nx, Ny, Nz;
	abstract public int[] getGeometryInfo();
	abstract public Point[][][] getField();
}
