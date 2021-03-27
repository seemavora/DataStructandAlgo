package mid1Example;

public class Fibonacci {
	
	public static int fib(int n) {
		if(n>=3) {
			return fib(n-2)+ fib(n-1);
		}else {
			return 1;
		}
	}
	
	public static void main(String [] args) {
		System.out.println(fib(5));
	}

}
