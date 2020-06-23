
public class T1Item {
	
	int count;
	String description;
	

	public void setCount(int a) {
		count = a;
	}
	
	public void pickUp(T1Item a) {
		a.setCount(a.getCount()+1);
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
