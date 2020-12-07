package eduSMG;

public class PalindromicPrime {

	public static void main(String[] args) {
		System.out.print(2+" ");
		
		int i =1;
		int num = 3;
		
		while(i < 120) {
			boolean isPalindrome = isPalindrome(num);
			if(!isPalindrome) {
				num++;
				continue;
			}
			boolean isPrime = isPrime(num);
					if(!isPrime) {
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

	
			public static boolean isPalindrome(int x) {
				int sameX = x;
				int reversedX =0;
				
				while(sameX!=0) {
					int lastDigit = sameX%10;
					reversedX = reversedX*10 + lastDigit;
					sameX/=10;
				}
				return x == reversedX;
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
}
