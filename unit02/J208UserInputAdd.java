package unit02;

import java.util.Scanner;

public class J208UserInputAdd {
	public static void main(String[] args) {
		int num1,num2;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		num1=input.nextInt();
		
		System.out.print("Enter num2: ");
		num2=input.nextInt();
		
		System.out.print("The Sum is: " + (num1 + num2));
		
	}
}
