package eduSMG;

import java.util.Date;

public class Account {
	private int id = 0;
	protected double balance = 0;
	private static double yearInterestRate = 0;
	private Date dateCreated = new Date();
	private static double monthlyInterestRate =  yearInterestRate / 12 ;
	Account(){
		
	}
	
	Account(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static double getYearInterestRate(){
		return yearInterestRate;
	}
	
	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	
	public static double getMonthlyInterestRate() {
		return monthlyInterestRate =  yearInterestRate / 12; 
	}
	
	public double getMonthlyInterest() {
		return monthlyInterestRate * balance / 100;
	}
	
	public void withdraw(double draw) {
		balance -= draw;
	}
	
	public void deposit(double draw) {
		balance += draw;
	}
	
	public String toString() {
		return "Balance: " + balance;
	}
	
}
