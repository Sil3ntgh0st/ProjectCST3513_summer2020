package ProblemThree;
import java.util.*;

public class ProblemThree {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		for(int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*100);
		}
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the Index");
		try {
			int index = input1.nextInt();
			System.out.println("Index:" + index + " = " + array[index]);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("The Index: " + ex.getLocalizedMessage() 
											 + " Try again.");
		} catch(Exception ex) {
			System.out.println("Invalid Input!");
		}
	}

}
