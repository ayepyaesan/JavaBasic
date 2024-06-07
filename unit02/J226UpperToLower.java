package unit02;

import java.io.IOException;

public class J226UpperToLower {

	public static void main(String[] args) throws IOException {
		char input;
		System.out.print("Enter Upper Case Character: ");
		input=(char) (System.in.read()+32);
		System.out.print("Convert to Lower Case = " + input);
	}

}
