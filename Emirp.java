package eduSMG;

public class Emirp {

	public static void main(String[] args) {
System.out.print(2+" ");
		
		int i =1;
		int num = 3;
		
		while(i < 120) {
			boolean isPrime = isPrime(num);
					if(!isPrime) {
						num++;
						continue;
					}
			boolean emirp = emirp(num);
				if(!emirp) {
					num++;
					continue;
				}
			System.out.print(num + " ");
			i++;
			num++;
			
			if(i%10==0) {
				System.out.println();
			}
		}

	}
		
	
	public static boolean isPrime(int x) {
		int maxDivider = (int)(Math.ceil(Math.sqrt(x)));
		
		boolean isPrime = true;
		for(int n = 2; n < maxDivider; n++) {
			if(x%n==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static boolean emirp(int x) {
		int sameX = x;
		int reversedX =0;
		
		while(sameX!=0) {
			int lastDigit = sameX%10;
			reversedX = reversedX*10 + lastDigit;
			sameX/=10;
		}
		int maxDivider = (int)(Math.ceil(Math.sqrt(reversedX)));
		
		boolean isPrime = true;
		for(int n = 2; n < maxDivider; n++) {
			if(reversedX%n==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		
	}
}
