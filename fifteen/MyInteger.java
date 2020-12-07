package fifteen;

public class MyInteger {
	private int value = 0;
	
	public int getValue() {
		return value;
	}
	
	public MyInteger(int value1) {
		value = value1;
	}
	
	public boolean isEven() {
		if(value%2==0) {return true;}else {return false;}
	}
	
	public boolean isOdd() {
		if(value%2==0) {return false;}else {return true;}
	}
	
	public boolean isPrime() {
		int maxDivider = (int)(Math.ceil(Math.sqrt(value)));
		
		boolean isPrime = true;
		for(int n = 2; n < maxDivider; n++) {
			if(value%n==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	
}
