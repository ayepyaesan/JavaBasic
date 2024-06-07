package unit02;

public class J222Interest {

	public static void main(String[] args) {
		int principal= 1000;
		double rate = .05;
		int time=5;
		
		double futureAmount;
		futureAmount= principal * rate * time;
		
		System.out.print("Principal = 1000 Dollars \nRate = 5 Percent\nTime = 5 Years\n");
		System.out.print("\nAnswer\nFuture Interest Amount is: " +futureAmount + " Dollers");
	}

}
