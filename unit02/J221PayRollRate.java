package unit02;

public class J221PayRollRate {

	public static void main(String[] args) {
		int hourlyPayRate= 500;
		int hours=40;
		double taxRate=.15;
		
		int grossPay= hourlyPayRate * hours;
		double withTax= grossPay * taxRate;
		double netPay= grossPay - withTax;
		
		System.out.println("Hourly Pay Rate\t: " + hourlyPayRate + " Kyats");
		System.out.println("One Week Hours\t: " + hours + " Hours");
		System.out.println("Tax Rate\t: " + taxRate + " Percent");
		System.out.println("\nAnswer\nGross Pay\t: " + grossPay + " Kyats");
		System.out.println("Withholding Tax\t: " + withTax +" Kyats");
		System.out.println("Net Pay\t\t: " + netPay + " Kyats");

	}

}
