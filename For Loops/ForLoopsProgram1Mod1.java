import java.util.Scanner;

public class ForLoopsProgram1Mod1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		int count = (int)(Math.random()*41)+60;

		System.out.println("Random scores to input: " + count);

		System.out.println();

		int out = 0;
		int sat = 0;
		int un = 0;

		for(int i = 1; i <= count; i++){
			int test = (int)(Math.random()*41)+60;
			System.out.println("Random Test # " + i + ": " + test);
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