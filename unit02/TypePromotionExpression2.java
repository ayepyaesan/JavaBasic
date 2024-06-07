package unit02;

public class TypePromotionExpression2 {

	public static void main(String[] args) {
		System.out.println("This program will illustrate the automatic type promotion of Java");
		byte a= 127;
		a++;
		System.out.println("Now the datatype of a has changed to int. a=> "+a);
		a=(byte)a;//explicit conversion of int a to byte a.
		System.out.println("Now it’s back to a byte. a=> "+a);

	}

}
