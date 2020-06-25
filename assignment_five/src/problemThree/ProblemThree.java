package problemThree;
import java.util.*;

public class ProblemThree {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f");
		
		double a = input1.nextDouble();
		double b = input1.nextDouble();
		double c = input1.nextDouble();
		double d = input1.nextDouble();
		double e = input1.nextDouble();
		double f = input1.nextDouble();
		
		LinearEquation result = new LinearEquation(a,b,c,d,e,f);
		
		if(result.isSolvable()) {
			System.out.println("X is: " + result.getX() + " and Y is: " + result.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}

}
