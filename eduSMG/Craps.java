package eduSMG;

public class Craps {

	public static void main(String[] args) {
		int range = 6;
		int x = (int)((Math.random()*range)+1);
		int y = (int)((Math.random()*range)+1);
		System.out.println(x + " + " + y + " = "  + (x + y));
		thrower(x, y);
				

	}
		public static void thrower(int dice1, int dice2) {
			int sum = dice1 + dice2;
			int sum2 = 0;
			int range = 6;
			
			if(sum == 7 || sum == 11) {
				System.out.println("You win!");
			}else if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You lose!");
			} else {
				do {
					int dice3 = (int)((Math.random()*range)+1);
					int dice4 = (int)((Math.random()*range)+1);
					sum2 = dice3 + dice4;
					System.out.println(dice3 + " + " + dice4 + " = "  + (dice3 + dice4));
					if(sum2 == sum) {
						System.out.println("You win!");
					} else if (sum2 == 7) {
						System.out.println("You lose!");
						break;
					}
					
				
			}
				while(sum2!=7 && sum2 != sum);
			}
			
			
			
			
			
			
		}
}
