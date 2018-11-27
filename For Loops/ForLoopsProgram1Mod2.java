import java.util.Scanner;

public class ForLoopsProgram1Mod2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("How many scores would you like to input? ");
		int count = neel.nextInt();

		System.out.println();

		int out = 0;
		int sat = 0;
		int un = 0;
		int tries = 3;
		String retake = "";

		for(int i = 1; i <= count; i++){
			System.out.print("Please enter Test # " + i + ": ");
			int test = neel.nextInt();
			neel.nextLine();
			if((test < 75) && (tries > 0)){
				System.out.print("\tWould you like to retake Test # " + i + "? ");
				retake = neel.nextLine();
				if(retake.equals("Yes")){
					tries--;
					System.out.print("\tPlease enter Test # " + i + ": ");
					test = neel.nextInt();
					System.out.println("\tRetakes Left: " + tries);
				}
			}
			if((test >= 90) && (test <= 100))
				out++;
			else if((test >= 70) && (test <= 89))
				sat++;
			else
				un++;
		}

		System.out.println();

		System.out.println("Outstanding Scores: " + out);
		System.out.println("Satisfactory Scores: " + sat);
		System.out.println("Unsatisfactory Scores: " + un);

		System.out.println();

	}
}