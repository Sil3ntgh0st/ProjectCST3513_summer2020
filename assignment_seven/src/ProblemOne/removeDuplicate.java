package ProblemOne;
import java.lang.reflect.Array;
import java.util.*;

public class removeDuplicate {
	
	public removeDuplicate(ArrayList<Integer> list){
		
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!temp.contains(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		list.clear();
		list.addAll(temp);
	}

}
