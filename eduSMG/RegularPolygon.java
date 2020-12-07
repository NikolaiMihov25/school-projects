package eduSMG;

public class RegularPolygon {
	private int n = 3;
	private double sideLenght = 1;
	private double x = 0;
	private double y = 0;
	
	public void RegularPolygon() {
		this.setN(n);
		this.setSideLenght(sideLenght);
		this.x=x;
		this.y=y;
	}
	
	public void Regularpolygon(int n, double sideLenght, double x, double y) {
		x = 0;
		y = 0;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public double getSideLenght() {
		return sideLenght;
	}
	
	public void setSideLenght(double sideLenght) {
		this.sideLenght=sideLenght;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	}

