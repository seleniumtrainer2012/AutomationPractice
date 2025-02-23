package typecasting;

public class Example1 {
	public static void main(String[] args) {
		//Typecasting in Java is the process of converting one data type into another
		
		//implicit typecasting
		byte b1=70;  //8bit		
		int i1=b1;  //32 bit
		System.out.println("i1"+i1);
		//explicit typecasting
		
		/*
		 * Manually done by the programmer Converts larger data types to smaller types
		 * (possible data loss)
		 */
		
		double d1=234234.23;
		int i2=(int)d1;
		
		
		int i3=697979;
		byte b3=(byte) i3;
		System.out.println(b3);
		
	}
}
