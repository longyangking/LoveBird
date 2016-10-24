package model;

public class Vertex {
	private double x,y,z;
	/**
	 * Define vertex
	 * @param x X
	 * @param y Y
	 * @param z Z
	 */
	public Vertex(double x, double y, double z){
		this.setX(x); this.setY(y); this.setZ(z);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString(){
		return String.format("%f %f %f",x,y,z);
	}
	
}
