package unit02;

import java.util.Scanner;

public class J211ItemToDozenItem {

	public static void main(String[] args) {
		int dozen,item,total;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter total items: ");
		total=input.nextInt();
		
		dozen=total/12;
		item=total%12;
		
		System.out.println(dozen + " Dozen and " + item + " items" );

	}

}
