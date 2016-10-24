package mesh;

public class LocalMesh {
	private double dx, dy, dz;
	public LocalMesh(double dx, double dy, double dz){
		this.setDx(dx); this.setDy(dy); this.setDz(dz);
	}
	public double getDx() {
		return dx;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	public double getDy() {
		return dy;
	}
	public void setDy(double dy) {
		this.dy = dy;
	}
	public double getDz() {
		return dz;
	}
	public void setDz(double dz) {
		this.dz = dz;
	}
	
}
