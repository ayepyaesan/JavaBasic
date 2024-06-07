package unit02;

import java.io.IOException;

public class J227LowerToUpper {

	public static void main(String[] args) throws IOException {
		char input;
		System.out.print("Enter Lower Case Character: ");
		input=(char) (System.in.read() - 32);
		
		System.out.print("Convert to Upper Case = " + input);
	}

}
