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
	
	public static boolean isEven(int myInt) {
		if(myInt%2==0) {
			return true;
		} else {return false;}
	}
	
	public static boolean isOdd(int myInt) {
		if(myInt%2==1) {
			return true;
		} else {return false;}
	}
	
	public static boolean isPrime(int myInt) {
		int maxDivider = (int)(Math.ceil(Math.sqrt(myInt)));	
		boolean isPrime = true;
		for(int n = 2; n < maxDivider; n++) {
			if(myInt%n==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean equals(int myInt) {
		if(myInt == value) {return true;}else {return false;}
	}
	
	public boolean equals(MyInteger myInt) {if(myInt.value == this.value) {return true;}else {return false;}
	}
	
	public static int parseInt(char[] values) {int sum = 0; for(char i : values) {sum+=Character.getNumericValue(i);}return sum;}
	
	public static int parseInt(String value){return Integer.parseInt(value);}
	
	
}
