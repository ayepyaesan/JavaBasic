package unit02;

public class UnaryOperator {

	public static void main(String[] args) {
		int num1=10, num2=5, res;
		int num3=1;
		boolean flag= true;
		char character='a';
		res=+character;
		System.out.println("The + operator on character transforms it to ASCII value " + res);
		
		num3 = -num3;
		System.out.println("The - operator on num1 positive value " +num3);
		
		res = num1++;
		System.out.println("The res=num1++ returned value of " + res);
		
		res = ++num1; 
		System.out.println("The res=++num1 returned num1 value of " + res);
		
		res = num2--; 
		System.out.println("The res=num2-- returned value of " + res);
		
		res = --num2; 
		System.out.println("The res=--num2 returned num1 value of " + res);
		
		System.out.println("The NOT operator returns num1 value of " + !flag);
	}

}
