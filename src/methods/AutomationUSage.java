package methods;

public class AutomationUSage {

	public static void main(String[] args) {
		add(12,15);
		int[] numbers= {23,12,23,23,53,78};
		add(numbers);
		APIUtils.GetCall("https://abc.com/add");
	}

	public static void add(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("sum="+sum);
	}	
	public static void add(int[] nums) {
		int arraySize=nums.length;
		int sum=0;
		for(int i=0;i<arraySize;i++) {
			sum=sum+nums[i];
		}
		System.out.println("sum="+sum);
	}
}
