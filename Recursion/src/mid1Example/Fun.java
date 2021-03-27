package mid1Example;

public class Fun {
	static int iteration = 0;
	public static int fun(int a, int b) {
		
		if (b==0){
			iteration++;
			System.out.println("Iteration #: " + iteration);
			System.out.println("a: " + a + "  b: " + b);
			return 1;
		}
		if (b%2 == 0) {
			iteration++;
			System.out.println("Iteration #: " + iteration);
			System.out.println("a: " + a + "  b: " + b);
			return fun(a*a, b/2);
		}
		iteration++;
		System.out.println("Iteration #: " + iteration);
		System.out.println("a: " + a + "  b: " + b);
		return fun(a*a, b/2)*a;
	}
	public static void main(String [] args) {
		System.out.println(fun(5,7));
	}

}
