import java.util.Scanner;

public class Simpleintrest {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		double PAmount, ROI, TimePeriod;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Principal Amount : ");
		PAmount = sc.nextDouble();
		
		System.out.print(" Please Enter the Rate Of Interest : ");
		ROI = sc.nextDouble();
		
		System.out.print(" Please Enter the Time Period in Years : ");
		TimePeriod = sc.nextDouble();
		
		calSimpleIntr(PAmount, ROI, TimePeriod);
		
	}
	public static void calSimpleIntr(double PAmount, double ROI, double TimePeriod)
	{
		double simpleInterset;
		
		simpleInterset = (PAmount * ROI * TimePeriod) / 100;
		
		System.out.println("\n The Simple Interest for Principal Amount " + PAmount + " is = " + simpleInterset);
	}
}