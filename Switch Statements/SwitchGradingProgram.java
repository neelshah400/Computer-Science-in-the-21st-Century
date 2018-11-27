import java.util.Scanner;

public class SwitchGradingProgram{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter your score: ");
		int score = neel.nextInt();

		String letter = "";

		if((score >= 93) && (score <= 100))
			letter = "A";
		else if((score >= 90) && (score <= 92))
			letter = "A-";
		else if((score >= 87) && (score <= 89))
			letter = "B+";
		else if((score >= 83) && (score <= 86))
			letter = "B";
		else if((score >= 80) && (score <= 82))
			letter = "B-";
		else if((score >= 77) && (score <= 79))
			letter = "C+";
		else if((score >= 73) && (score <= 76))
			letter = "C";
		else if((score >= 70) && (score <= 72))
			letter = "C-";
		else if((score >= 65) && (score <= 69))
			letter = "D";
		else
			letter = "F";

		System.out.print("Your grade is ");

		switch(letter){
			case "A": System.out.print("an");
				break;
			case "A-": System.out.print("an");
				break;
			case "F": System.out.print("an");
				break;
			default: System.out.print("a");
		}

		System.out.println(" " + letter + ".");
		System.out.println();

	}
}