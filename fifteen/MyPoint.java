package fifteen;

public class MyPoint {
	public int x = 0;
	public int y =0;
	
	MyPoint(){
		
	}
	
	MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public double distance(MyPoint z) {
		double x1 = Math.abs(z.x);
		double y1 = Math.abs(z.y);
		double distance = Math.sqrt((Math.pow(x1, 2)) + Math.pow(y1, 2));
		return distance;
		}
	
	public double distanceBetweenTwoSpecifiedPoints(MyPoint a, MyPoint b) {
		double x1 = Math.abs(b.x - a.x);
		double y1 = Math.abs(b.y - a.y);
		double distance2 = Math.sqrt((Math.pow(x1, 2)) + Math.pow(y1, 2));
		return distance2;
	}
}
