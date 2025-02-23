package methods;
public class Example2 {
	public static void main(String[] args) {
		//static methods
		method1();
		Example2.method1();
				
		//instance methods
		Example2 e=new Example2();
		e.method2();
	}
	
	//static vs instance	
	public static  void method1() {
		System.out.println("static method1");
	}	
	public  void method2() {
		System.out.println("static method1");
	}
}
