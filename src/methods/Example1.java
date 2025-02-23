package methods;

public class Example1 {
	public static void main(String[] args) {		
		sum(10, 15);
		sum(130, 1365);
	
		int total=mysum(32,10);
		System.out.println(total);
	}


	public static void sum(int num1, int num2) {
		System.out.println("sum="+(num1+num2));		
	}
	
	public static int mysum(int num1, int num2) {
		int sum=num1+num2;	
		return sum;
	}

}
