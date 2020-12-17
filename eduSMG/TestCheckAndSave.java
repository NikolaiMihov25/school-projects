package eduSMG;

public class TestCheckAndSave {

	public static void main(String[] args) {
		SavingsAccount save = new SavingsAccount(10, 400);
		save.withdraw(350);
		System.out.println(save.toString());
		
		CheckingAccount check = new CheckingAccount(15, 500, 300);
		check.withdraw(900);
		System.out.println(check.toString());
	}

}
