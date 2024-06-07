package unit02;

import java.util.Scanner;

public class J213MileToKiloMeter {

	public static void main(String[] args) {
		int mile;
		float km;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Mile: ");
		mile=input.nextInt();
		
		km= (float) (mile*1.609344);
		System.out.println("KiloMeter is: " + km);

	}

}
