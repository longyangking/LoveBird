package model;

public class Vector {
	private double x, y, z;
	/**
	 * Define vector
	 * @param x X
	 * @param y Y
	 * @param z Z
	 */
	public Vector(double x, double y, double z){
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
	
	/**
	 * Normalize vector 
	 * @return Vector
	 */
	public Vector normalize(){
		double norm = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		return new Vector(x/norm,y/norm,z/norm);
	}
	@Override
	public String toString(){
		return String.format("%f %f %f",x,y,z);
	}
}
