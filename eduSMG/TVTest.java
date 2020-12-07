package eduSMG;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		System.out.println("Channel: " + tv1.channel + "\nVolume: " + tv1.volume + "\nON: " + tv1.turnedOn);
		tv1.switchOn();
		tv1.setChannel(10);
		tv1.setVolume(20);
		tv1.channelUp();
		tv1.channelDown();
		tv1.volumeUp();
		tv1.volumeDown();
		System.out.println("Channel: " + tv1.channel + "\nVolume: " + tv1.volume + "\nON: " + tv1.turnedOn);
		tv1.switchOff();
		System.out.println("\nON: " + tv1.turnedOn);
	}

}
