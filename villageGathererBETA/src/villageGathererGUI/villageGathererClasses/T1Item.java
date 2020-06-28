package villageGathererClasses;
import java.util.*;


public class T1Item {
	
	public int count;
	public static int stickCount;
	public static int stoneCount;
	public String description, item;
	public static String[] itemListString;
	public static ArrayList<String> itemList = new ArrayList<>();
	
	public T1Item(){
		item = "";
		count = 0;
		stickCount = 0;
		stoneCount = 0;
		description = "";
		System.out.println("No item made");
	}
	
	public T1Item(String itemName){
		this.item = itemName;
		this.count ++;
		this.description = "";
		T1Item.itemList.add(itemName);
//		or switch case can be used here for multiple items, 
//		or even a loop of items can be placed here
		if(itemName == "Stick") {
			stickCount++;
		}
		else if (itemName == "Stone") {
			stoneCount++;
		}
		System.out.println(itemName + " was created");
	}
	
	public boolean isStick() {
		if(this.item == "Stick") {
			return true;
		}
		return false;
	}
	
	public void setCount(int a) {
		count = a;
	}
	
	
//	public void pickUp(T1Item a) {
//		a.setCount(a.getCount()+1);
//	}
	
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
		}
		return hasItem;
		
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

//	public static String getAllItems(ArrayList<String>[] a) {
//		
//		int count = 0;
//		
//		for (int i = 0; i < a.length ; i++ ) {
//			count++;	
//		} 
//		return "Your items are: " + itemList.get(count);
//		
//	}
	
	public static Integer allItemsSize() {
		
		int temp = 0;
		
		temp = itemList.size();
		
		return temp;
	}
	
}