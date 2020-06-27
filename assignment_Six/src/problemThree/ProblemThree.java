package problemThree;

public class ProblemThree {

	public static void main(String[] args) {
		
		QueueClass queue = new QueueClass();
		for(int i = 0; i < 20; i++) {
			queue.enqueue(i);
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("%a", queue.dequeue());
			if((i+1) % 5 ==0) {
				System.out.println("");
			}
		}
	}

}
