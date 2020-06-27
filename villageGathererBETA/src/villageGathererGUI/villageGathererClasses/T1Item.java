package villageGathererClasses;
import java.util.*;
import java.util.stream.IntStream;
import java.math.*;


public class T1Item {
	
	int count, stickCount, stoneCount;
	String description;
	
	public T1Item(){
		this.count = 0;
		this.stickCount = 0;
		this.stoneCount = 0;
		description = "";
	}
	

	public void setCount(int a) {
		count = a;
	}
	
	public void pickUp(T1Item a) {
		a.setCount(a.getCount()+1);
	}
	
	public void giveItem() { //meant to give you either a stick or stone
		Random rand = new Random();
		int totalSum = 0;
		int decision = rand.nextInt(1000);
		
		if(decision % 2 != 0 ) {
			stickCount++;
			description = "You gained a Stick";
		}
		else {
			stoneCount++;
			description = "You gained a Stone";
			
		}
		
	}
	
	public int getCount() {
		return count;
	}
	
	public void setDescription(String a) {
		description = a;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean hasItem(T1Item a) {
		boolean hasItem = false;
		if (a.count>0) {
			hasItem = true;
		}return hasItem;
	}
	
	public void craft(T1Item a, T1Item b, T1Item c) {		
		a.setCount(a.getCount()-1);
		b.setCount(b.getCount()-1);
		c.setCount(c.getCount()+1);	
	}
	
	public void eat(T1Item a) {
		a.setCount(a.getCount()-1);
	}
	
	public static void canEat(T1Item [] a) {
		for (int i=0; i<a.length; i++) {
			if(a[i].getCount()>0) {
				System.out.println("You can eat "+a[i].getDescription());
			}
		}
	}
	
	
	
	

}
