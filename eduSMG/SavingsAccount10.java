package eduSMG;

public class SavingsAccount10 {
	public String name;
	public double balance;
	
	public void deposit(double x) {
		balance += x;
	}
	
	public void withdraw(double x) {
		balance -= x;
	}
}
