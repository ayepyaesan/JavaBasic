package unit02;

import java.io.IOException;

public class J203UserInputChar {

	public static void main(String[] args) throws IOException {
		char ch;
		int i;
		
		System.out.print("Enter a character: ");
		ch= (char)System.in.read();
		i= (int) ch;
		
		System.out.println("The Character you entered is: " + ch);
		System.out.println("The Integer Value for char: " + i);

	}

}
