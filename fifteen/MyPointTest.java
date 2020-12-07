package fifteen;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(5, 5);
		System.out.println(point1.distance(point1));
		
		MyPoint point2 = new MyPoint(10, 5);
		System.out.println(point2.distanceBetweenTwoSpecifiedPoints(point1, point2));
	}

}
