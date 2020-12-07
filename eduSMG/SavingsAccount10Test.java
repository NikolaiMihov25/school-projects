package eduSMG;

public class SavingsAccount10Test {

	public static void main(String[] args) {
		SavingsAccount10 ivan = new SavingsAccount10();
		ivan.name = "Ivan Dimirov";
		ivan.balance = 10000;
		ivan.deposit(1500);
		ivan.withdraw(5000);
		System.out.println(ivan.balance);
	}

}
