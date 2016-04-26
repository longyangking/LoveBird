package lovebird;

public class Field {
	Point[][][] points;
	int Nx, Ny, Nz;
	public Field(int Nx, int Ny, int Nz){
		this.Nx = Nx; this.Ny = Ny; this.Nz = Nz;
		points = new Point[Nx][Ny][Nz];
	}
	public int[] getGeometryInfo(){
		return new int[]{Nx,Ny,Nz};
	}
	public Point[][][] getField(){
		return points;
	}
}
