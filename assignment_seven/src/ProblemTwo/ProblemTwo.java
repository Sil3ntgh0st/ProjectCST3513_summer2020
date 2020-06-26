package ProblemTwo;
import java.util.*;

public class ProblemTwo {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Enter five numbers for the firstlist");
		for(int i = 0; i < 5; i++) {
			list1.add(input1.nextInt());
		}
		System.out.println("Enter five numbers for the second list");
		for(int i = 0; i < 5; i++) {
			list2.add(input1.nextInt());
		}
		
		System.out.println("The combined list is ");
		new CombineTwo(list1, list2);
		
	}

}
