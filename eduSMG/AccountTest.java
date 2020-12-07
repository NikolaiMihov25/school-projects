package eduSMG;

public class AccountTest {

	public static void main(String[] args) {
		Account Pesho = new Account(1122, 20000);
		Pesho.setYearInterestRate(4.5);
		Pesho.withdraw(2500);
		Pesho.deposit(3000);
		System.out.println(Pesho.getBalance() + " " + Pesho.getId() + " " + Pesho.getMonthlyInterestRate() + " " + Pesho.getMonthlyInterest());

	}

}
