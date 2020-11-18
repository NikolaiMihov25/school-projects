package eduSMG;

public class Circle2 {
	public double radius = 1;
	public Circle2() {
		
	}
	
	public Circle2(double newRadius) {
		radius = newRadius;
	}
	double perimeter;
	double area;
	public double getArea() {
		return area = radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return perimeter = radius * 2 * Math.PI;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
}
