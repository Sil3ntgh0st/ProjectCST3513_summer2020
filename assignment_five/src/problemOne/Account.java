package problemOne;
import java.util.*;

public class Account {
	
	private int userId;
	private double userBalance;
	private double annualInterestRate;
	private Date userDateCreated;
	
	public Account() {

		userDateCreated = new Date();
		userId = 0;
		userBalance = 0;
		annualInterestRate= 0;
		
		
	}
	
	public Account(int iD, int balance) {
		this();
		this.userId = iD;
		this.userBalance = balance;
	}
	
	public void setId(int iD) {
		this.userId = iD;
	}	
	public void setBalance(double balance) {
		this.userBalance = balance;
	}
	public void setAnnualInterest(double annualInterest) {
		this.annualInterestRate = annualInterest;
	}
	
	public int getId() {
		return this.userId;
	}
	public double getBalance() {
		return this.userBalance;
	}
	public double getAnnualInterest() {
		return this.annualInterestRate;
	}
	
	public Date getUserDateCreated() {
		return this.userDateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return this.userBalance * (this.annualInterestRate/12)/100;
	}
	public double getMonthlyInterest() {
		return (this.userBalance * this.annualInterestRate);
	}
	public void withdraw(double amount) {
		this.userBalance -=amount;
	}
	public void deposit(double amount) {
		this.userBalance +=amount;
	}
	
	@Override
	public String toString() {
		return "Account name: " + this.userId +  "\n" + "Balance: " + this.userBalance 
								+ "\n" + "Monthly Interest: " + getMonthlyInterest()
								+ "\n" + "Date: " + this.userDateCreated;
	}
	

}
