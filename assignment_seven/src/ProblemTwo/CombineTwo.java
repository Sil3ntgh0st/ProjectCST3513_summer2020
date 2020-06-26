package ProblemTwo;
import java.util.*;

public class CombineTwo {
	
	public CombineTwo(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		temp.addAll(list1);
		temp.addAll(list2);
		System.out.println(temp);
	}

}
