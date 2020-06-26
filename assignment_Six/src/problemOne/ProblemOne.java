package problemOne;
import java.util.*;

public class ProblemOne {

	public static void main(String[] args) {
		
		Account[] accountID = new Account[10];
		Scanner input1 = new Scanner(System.in);
		
		for (int i = 1; i < 11; i++) {
			accountID[i-1] = new Account(i, 100.0);	
		}
		
		System.out.println("Enter an Id from 1-10");
		int id = input1.nextInt();
		
		
		boolean checkMe = true;
		if(id < 1 || id > 10) {
			System.out.println("Invalid ID");
			checkMe = false;
		}
		else if (checkMe == true) {
			Account.showMenu();
			System.out.println("Enter a choice");
			int choice = input1.nextInt();
			
			if(choice == 4) {
				System.out.println("Enter an Id from 1-10");
				id = input1.nextInt();
				if(id < 1 || id > 10) {
					checkMe = false;
				}
			}
		
		Account.getChoice(id, choice, accountID);
		
		input1.close();
			
		}
		
		
		
		

	}

}
