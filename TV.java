package eduSMG;

public class TV {
		public int channel;
		public int volume;
		public boolean turnedOn;
		
			public TV() {
				channel = 1;
				volume = 10;
				turnedOn = false;
			}
			
		public void switchOn() {
			turnedOn = true;
		}
		
		public void setChannel ( int newChannel) {
			if(newChannel > 120 || newChannel < 0 || !turnedOn) {return;}
			channel = newChannel;
		}
		
		public void setVolume(int newVolume) {
			if(newVolume < 1 || newVolume > 25 || !turnedOn) {
				return;
			}
			volume = newVolume;
}

		public void channelUp() {
			if(channel == 120 || !turnedOn) {return;}
			channel ++;
		}
		
		public void channelDown() {
			if (channel == 1 || !turnedOn) {return;}
			channel --;
		}
		
		public void volumeUp() {
			if(volume == 25 || !turnedOn) {return;}
			volume ++;
		}
		
		public void volumeDown() {
			if(volume == 1 || !turnedOn) {return;}
			volume --;
		}
		
		public void switchOff() {
			turnedOn = false;
		}
}