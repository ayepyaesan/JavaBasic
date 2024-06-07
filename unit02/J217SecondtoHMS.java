package unit02;

public class J217SecondtoHMS {

	public static void main(String[] args) {
		int seconds=10000, hour,minute,second;
		hour= seconds/3600;
		minute= (seconds%3600)/60;
		second= (seconds%60)%60;
		System.out.println(" 10000 Seconds = " + hour + " Hours " + minute +" Minutes " + second + " Seconds");
	}

}
