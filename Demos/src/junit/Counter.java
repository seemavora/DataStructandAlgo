package junit;

public class Counter {
	int counter = 5;
	
	public int increment() {
		return counter += 1;
	}
	
	public int decrement() {
		return counter -= 1;
		
	}

	public int getCount() {
		return counter;
		
	}
}
