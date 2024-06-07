package unit02;

import java.util.Scanner;

public class J212WorkHourPayRate {

	public static void main(String[] args) {
		int workdays,workhours,payrate,weeklypay;
		workdays=5;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter hourly pay rate: ");
		payrate=input.nextInt();
		
		System.out.println("Enter work hours");
		workhours=input.nextInt();
		
		weeklypay= workdays * payrate * workhours;
		
		System.out.print("Weekly Pay is: " + weeklypay);
		
	}

}
