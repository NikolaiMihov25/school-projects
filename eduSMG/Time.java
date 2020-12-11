package eduSMG;

public class Time {
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	
	Time(){
		long currentTime = System.currentTimeMillis();
		setTime(currentTime);
	}
	
	Time(int hours, int minutes, int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	public Time(long elapseTime) {
		setTime(elapseTime);
	}
	
	public void setTime(long elapseTime) {
		long inSeconds = elapseTime/1000;
		this.seconds = (int)(inSeconds%60);
		long inMinutes = inSeconds/60;
		this.minutes = (int)(inMinutes%60);
		long inHours = inMinutes/60;
		this.hours = (int)(inHours%24);
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
	
}
