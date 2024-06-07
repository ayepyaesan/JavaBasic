package unit02;

public class ShiftOperator {

	public static void main(String[] args) {
		int num1=10, num2=5;
		System.out.println("The result after performing left shift " + (num1 << 2));
		System.out.println("The result after performing right signed shift" + (num1 >> 2));
		System.out.println("The result after performing right unsigned shift " + (num1 >>> 2));
	}

}
