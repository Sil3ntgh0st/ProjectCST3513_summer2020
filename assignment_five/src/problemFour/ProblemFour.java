package problemFour;
import java.util.*;

public class ProblemFour {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter amount of rows and columns");
		int row = input1.nextInt();
		int column = input1.nextInt();
		double[][] matrix = new double[row][column];
		
		System.out.println("Enter your array");
		for(int i = 0; i < matrix.length; i++) {
			for(int n = 0; n < matrix[i].length; n++) {
				matrix[i][n] = input1.nextDouble();
			}
		}
		
		Location result = Location.showLargest(matrix);
		
		System.out.println("The largest element is " + result.maxValue + "and is found at: (" + result.row + ", " + result.column + ")");
		
	}

}
