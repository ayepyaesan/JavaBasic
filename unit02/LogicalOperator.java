package unit02;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String uname,course;
		
		System.out.println("Enter the user name: ");
		uname=sc.next();
		
		System.out.println("Enter the course: ");
		course= sc.next();
		
		if(uname.equals("AIT") && course.equals("Java")) {
			System.out.println("Your course is going on at AIT Computer");
		}
		System.out.println("Enter the username");
		System.out.println("Enter the course");
		uname = sc.next();
		course = sc.next();
		if (uname.equals("AIT") || course.equals("Python")) {
		System.out.println("You are either studying at AIT Computer or studying python");
			
		}
	}

}
