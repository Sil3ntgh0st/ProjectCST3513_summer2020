package problemOne;
import java.util.*;

public class Account {
	
	private int accountId;
	private static double balance;
	private Account[] accounts;
	
	public Account() {
		
		
		
	}
	
	public Account(int id, double b) {
		this.balance = b;
		this.accountId = id;
	}
	
	public static void showMenu() {
		System.out.println("Main Menu");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: exit");
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double b) {
		this.balance = this.balance - b;
	}
	
	public void deposit(double e) {
		this.balance = this.balance + e;
	}
	
	public static void checkBalance() {
		System.out.println("Your current balance is: " + balance);
	}
	
	public static void getChoice(int id, int choice, Account[] a) {
		Scanner input1 = new Scanner(System.in);
		switch(choice){
			case 1:
				System.out.println("The balance is " + a[id-1].getBalance());
				break;
			case 2:
				System.out.println("Enter how much you're withdrawing ");
				a[id-1].withdraw(input1.nextDouble());
				checkBalance();
				break;
			case 3:
				System.out.println("Enter how much you're depositing");
				a[id-1].deposit(input1.nextDouble());
				break;
			default:
				break;
		}
	}
	
	

}
