package eduSMG;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double yearInterestRate = 0;
	private Date date = new Date();
	private double monthlyInterestRate =  yearInterestRate / 12 ;
	Account(){
		
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public Date getDate() {
		return date;
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
	
	public double getYearInterestRate(){
		return yearInterestRate;
	}
	
	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return monthlyInterestRate =  yearInterestRate / 12; 
	}
	
	public double getMonthlyInterest() {
		return monthlyInterestRate * balance / 100;
	}
	
	public void withdraw(double x) {
		balance -= x;
	}
	
	public void deposit(double x) {
		balance += x;
	}
}
