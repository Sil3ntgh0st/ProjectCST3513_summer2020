package villageGathererClasses;
import java.util.*;


public class T1Item {
	
	public int count;
	public static int stickCount;
	public static int stoneCount;
	public static int axeCount;
	public static int fishCount;
	public String description, item;
	public static String[] itemListString;
	public static ArrayList<String> itemList = new ArrayList<>();
	
	public T1Item(){
		item = "";
		count = 0;
		stickCount = 0;
		stoneCount = 0;
		fishCount = 0;
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
		else if (itemName == "Fish") {
			fishCount++;
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
	
	public static void craft(int a, int b, T1Item c) {
		
		if(c.item == "Axe"){
			//Temporary fix until a.setCount(a.getCount()-21) works
			stickCount -= a; 
			stoneCount -= b;
			axeCount++;
		}
		

	}
	
	
	public static void eat(T1Item b) {
		if(b.item == "Fish") {
		fishCount -=1;
		Player.addEnergyLevel();
		}
	}
	
	public static boolean canEat(String a) {
		if (a == "Fish"){
			if(fishCount >=1){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	public static boolean getRequirements(String a){
		if (a == "Axe"){
			if(stickCount >=31 && stoneCount >= 21){
				return true;
			}else{
				return false;
			}
		}
		return false;
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

	public static int getStickCount() {
		
		return T1Item.stickCount;
	}
	
	public static int getStoneCount() {
		
		return T1Item.stoneCount;
	}
	
}
