package ProblemOne;
import java.util.*;

public class ProblemOne {

	public static void main(String[] args) {
		
		System.out.println("Enter 10 numbers ");
		Scanner input1 = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(input1.nextInt());
		}
		
		new removeDuplicate(list);
		System.out.println("List successfully removed duplicates");
		System.out.println(list);
		
	}

}

