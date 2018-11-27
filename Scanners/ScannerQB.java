import java.util.Scanner;

public class ScannerQB{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		//Player 1

		System.out.print("Player 1: ");
		String name1 = neel.nextLine();

		System.out.print("Yards: ");
		int yds1 = neel.nextInt();

		System.out.print("Completions: ");
		int comp1 = neel.nextInt();

		System.out.print("Touchdowns: ");
		int td1 = neel.nextInt();

		System.out.print("Interceptions: ");
		int in1 = neel.nextInt();

		System.out.print("Attempts: ");
		int att1 = neel.nextInt();

		double a1 = (((((double)comp1 /att1) * 100.0) - 30.0) / 20.0);
		double b1 = ((((double)td1 /att1) * 100.0) / 5.0);
		double c1 = ((9.5 - (((double)in1 /att1) * 100.0)) / 4.0);
		double d1 = ((((double)yds1 / att1) - 3.0) / 4.0);
		double qb1 = ((a1 + b1 + c1 + d1) / 0.06);

		System.out.println();

		//Player 2

		neel.nextLine();

		System.out.print("Player 2: ");
		String name2 = neel.nextLine();

		System.out.print("Yards: ");
		int yds2 = neel.nextInt();

		System.out.print("Completions: ");
		int comp2 = neel.nextInt();

		System.out.print("Touchdowns: ");
		int td2 = neel.nextInt();

		System.out.print("Interceptions: ");
		int in2 = neel.nextInt();

		System.out.print("Attempts: ");
		int att2 = neel.nextInt();

		double a2 = (((((double)comp2 /att2) * 100.0) - 30.0) / 20.0);
		double b2 = ((((double)td2 /att2) * 100.0) / 5.0);
		double c2 = ((9.5 - (((double)in2 /att2) * 100.0)) / 4.0);
		double d2 = ((((double)yds2 / att2) - 3.0) / 4.0);
		double qb2 = ((a2 + b2 + c2 + d2) / 0.06);

		System.out.println();

		//Output Chart

		System.out.println("Player\t\tYards\t\tCompletions\tTouchdowns\tInterceptions\tAttempts\tRating");

		System.out.println();

		System.out.println(name1 + "\t" + yds1 + "\t\t" + comp1 + "\t\t" + td1 + "\t\t" + in1 + "\t\t" + att1 + "\t\t" + qb1);
		System.out.println(name2 + "\t" + yds2 + "\t\t" + comp2 + "\t\t" + td2 + "\t\t" + in2 + "\t\t" + att2 + "\t\t" + qb2);

		System.out.println();

	}
}