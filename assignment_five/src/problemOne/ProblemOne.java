package problemOne;

public class ProblemOne {

	public static void main(String[] args) {
		
		Account newUser = new Account(1122, 20000);
		newUser.setAnnualInterest(4.5);
		System.out.println("Account ID: " + newUser.getId());
		System.out.println("Account Balance: " + newUser.getBalance());
		
		System.out.println("Withdrawing... please wait");
		newUser.withdraw(2500);

		System.out.println("Depositing... please wait");
		newUser.deposit(3000);
		
		System.out.println("Updated info below");
		System.out.println("Account ID: " + newUser.getId());
		System.out.println("Account Balance: " + newUser.getBalance());
		System.out.println("Monthly Interest Rate: " + newUser.getMonthlyInterestRate());
		System.out.println("Account created on: " + newUser.getUserDateCreated());
	}

}
