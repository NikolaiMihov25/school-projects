package eduSMG;

public class CircleTest {

	public static void main(String[] args) {
	Circle c1 = new Circle();
	System.out.println("The area of a circle with a radius " + c1.radius + " is " + c1.getArea());
	
	Circle c2 = new Circle(25);
	System.out.println("The area of a circle with a radius " + c2.radius + " is " + c2.getArea());
	
	Circle c3 = new Circle(125);
	System.out.println("The area of a circle with a radius " + c3.radius + " is " + c3.getArea());
	
	c2.radius = 100;
	System.out.println("The area of a circle with a radius " + c2.radius + " is " + c2.getArea());
	}

}
