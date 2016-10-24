package fdtd;

public class Point {
	double x, y, z;
	double Ex, Ey, Ez;
	double Hx, Hy, Hz;
	double ExTheta, EyTheta, EzTheta;
	double HxTheta, HyTheta, HzTheta;
	public Point(){
		this.x = 0; this.y = 0; this.z = 0;
		this.Ex = 0; this.Ey = 0; this.Ez = 0;
		this.Hx = 0; this.Hy = 0; this.Hz = 0;
		this.ExTheta = 0; this.EyTheta = 0; this.EzTheta = 0;
		this.HxTheta = 0; this.HyTheta = 0; this.HzTheta = 0;
	}
	public Point(double Ex, double Ey, double Ez, double ExTheta, double EyTheta, double EzTheta){
		this.Ex = Ex; this.Ey = Ey; this.Ez = Ez;
		this.ExTheta = ExTheta; this.EyTheta = EyTheta; this.EzTheta = EzTheta;
		// TODO Initiate H field by using E field
	}
	public double getEx(){
		return this.Ex;
	}
	public double getEy(){
		return this.Ey;
	}
	public double getEz(){
		return this.Ez;
	}
	public double getHx(){
		return this.Hx;
	}
	public double getHy(){
		return this.Hy;
	}
	public double getHz(){
		return this.Hz;
	}
	public double getExTheta(){
		return this.ExTheta;
	}
	public double getEyTheta(){
		return this.EyTheta;
	}
	public double getEzTheta(){
		return this.EzTheta;
	}
	public double getHxTheta(){
		return this.HxTheta;
	}
	public double getHyTheta(){
		return this.HyTheta;
	}
	public double getHzTheta(){
		return this.HzTheta;
	}
	public void setEx(double Ex){
		this.Ex = Ex;
	}
	public void setEy(double Ey){
		this.Ey = Ey;
	}
	public void setEz(double Ez){
		this.Ez = Ez;
	}
	public void setHx(double Hx){
		this.Hx = Hx;
	}
	public void setHy(double Hy){
		this.Hy = Hy;
	}
	public void setHz(double Hz){
		this.Hz = Hz;
	}
	public void setExTheta(double Theta){
		this.ExTheta = Theta;
	}
	public void setEyTheta(double Theta){
		this.EyTheta = Theta;
	}
	public void setEzTheta(double Theta){
		this.EzTheta = Theta;
	}
	public void setHxTheta(double Theta){
		this.HxTheta = Theta;
	}
	public void setHyTheta(double Theta){
		this.HyTheta = Theta;
	}
	public void setHzTheta(double Theta){
		this.HzTheta = Theta;
	}
}