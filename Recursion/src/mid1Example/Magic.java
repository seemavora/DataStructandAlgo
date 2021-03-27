package mid1Example;

public class Magic {
	static int calls = 0;
	public static void mag(int n) {
		if (n>0) {
			calls++;
			System.out.println("Calls: " + calls);
			System.out.println("n: " + n);
			mag((n/2));
		}
		if(n%2 == 1) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
	}

	public static void main(String[] args)
	{
		mag(20);
	}

}

