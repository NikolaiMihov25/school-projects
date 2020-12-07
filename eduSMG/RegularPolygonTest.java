package eduSMG;

public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon();
		rp1.setN(6);
		rp1.setSideLenght(4.7);
		
		rp2.setN(10);
		rp2.setSideLenght(4);
		rp2.setX(5.6);
		rp2.setY(7.8);
		
		getPerimeter(rp1);
		getArea(rp1);
		getPerimeter(rp2);
		getArea(rp2);
	}
	
	public static void getPerimeter(RegularPolygon rp){
		double perimeter = rp.getN()*rp.getSideLenght();
		double per = (double)Math.round(perimeter*100)/100;
		System.out.println("P = " + per);
	}
	
	public static void getArea(RegularPolygon rp) {
		double degrees = 180/rp.getN();
		double radians = Math.toRadians(degrees);
		double tg = Math.tan(radians);
		double cotg = 1/tg;
		double area = rp.getN()*rp.getSideLenght()*cotg/4;
		double ar = (double)Math.round(area*100)/100;
		System.out.println("S = " + ar);
	}
}
