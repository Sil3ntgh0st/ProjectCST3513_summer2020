package villageGathererClasses;
import java.util.*;

//import javax.swing.JButton;


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
	
	public static void craft(T1Item a, T1Item b, T1Item c) {
		
		if(c.item == "Axe"){
			a.setCount(a.getCount()-31);
			b.setCount(b.getCount()-21);
			c.setCount(c.getCount()+0);
			//Temporary fix until a.setCount(a.getCount()-21) works
			stickCount -= 31; 
			stoneCount -= 21;
			axeCount++;
		}
		a.setCount(a.getCount()-1);
		b.setCount(b.getCount()-1);
		c.setCount(c.getCount()+1);	
	}
	
	
	public static void eat(int i, int fishCount) {
		if(fishCount <= 0) {
			System.out.println("No fish left");
		}
		else {
		fishCount -=i;
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
		else if(a == "Fishing Rod"){
			if(stickCount >= 6){
				return true;
			}else{
				return false;
			}
		}
		else if(a == "Hammer"){
			if(stickCount >=5 && stoneCount >= 7){
				return true;
			}
			else{
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

	
}
