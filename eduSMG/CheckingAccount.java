package eduSMG;

public class CheckingAccount extends Account {
	private double overDraftLimit;
	
	CheckingAccount(int id, double balance, double overDraft){
		super(id, balance);
		setOverDraftLimit(overDraft);
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void withdraw(double draw) {
		if(balance + overDraftLimit>= draw) {
		balance -= draw;
		}
	}
	
	public String toString() {
		return super.toString() + " Checking account";
	}
	
	
}
