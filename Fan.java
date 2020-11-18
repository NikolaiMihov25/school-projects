package eduSMG;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean switchedOn = false;
	private String color = "Blue";
	private double radius = 5;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isSwitchedOn() {
		return switchedOn;
	}
	
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn=switchedOn;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		radius = radius;
	}
	
	public void turnOn() {
		switchedOn = true;
	}
	
	public void turnOff() {
		this.switchedOn = false;
	}
	
	public void speedMax() {
		speed = FAST;
	}
	
	public void speedMed() {
		speed = MEDIUM;
	}
	
	public Fan() {
		
	}
	

		
	}

