package problemThree;

public class QueueClass {
	
	private int[] elements;
	private int size;
	private int maxSize;
	
	public QueueClass(int m) {
		this.maxSize = m;
	}
	
	public QueueClass() {
		this(8);
	}
	
	public void enqueue(int v) {
		if (size >= elements.length) {
			int [] temp = new int[size*2];
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		}
		elements[size++] = v;
	}
	
	public int dequeue() {
		int v = elements[0];
		size--;
		for (int i = 0; i < size; i++) {
			elements[i] = elements[i+1];
		}
		return v;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
}
