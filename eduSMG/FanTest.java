package eduSMG;

public class FanTest {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.speedMax();
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.turnOn();
		
		fan2.speedMed();
		fan2.setRadius(5);
		fan2.setColor("Blue");
		fan2.turnOff();
		
		toString(fan1);
		toString(fan2);
		
		
	}
	public static void toString(Fan fan) {
		if(!fan.isSwitchedOn()) {
			String descriptionOff = fan.getColor() + " " + String.valueOf(fan.getRadius()) + " Вентилаторът е изключен";
			System.out.println(descriptionOff);
		}else {
			String descriptionOn = String.valueOf(fan.getSpeed()) + " " + fan.getColor() + " " + String.valueOf(fan.getRadius());
			System.out.println(descriptionOn);}
}
}