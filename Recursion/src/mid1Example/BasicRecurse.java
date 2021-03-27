package mid1Example;

public class BasicRecurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHi(5);

	}

	public static void sayHi(int n) {
		if (n ==0) {
			System.out.println("Done!");
		}else {
			System.out.println("hi");
			n--;
			sayHi(n);
		}
	}
	
	
}
