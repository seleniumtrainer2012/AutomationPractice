package methods;
public class MethodOverloadingExample1 {
	public static void main(String[] args) {
		method1("Chrome");
	}
	public static void method1(String BrowserName){

	}
	public static int method1(String BrowserName){
		return 10;
	}

	public static void launchBrowser(String BrowserName){

	}

	public static void launchBrowser(String BrowserName, String gridURL){

	}

	public static void GetCall(String endpointURL) {

	}
	public static void GetCall(String endpointURL, String payload) {

	}

}
