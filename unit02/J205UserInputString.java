package unit02;

import java.util.Scanner;

public class J205UserInputString {

	public static void main(String[] args) {
		String str;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a string:");
		str=input.nextLine();
		
		System.out.print("Your String is: " + str);
	}

}
