import java.util.Scanner;

public class IfElseQuiz{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);
		String prompt1, prompt2, prompt3;
		double cost = 0.0;

		System.out.println("Welcome to Ye Olde Ice Cream Shoppe!");
		System.out.println();

		System.out.println("Prices are as follows:");
		System.out.println("Chocolate:\t$2.50");
		System.out.println("Vanilla:\t$2.00");
		System.out.println("Sprinkles:\t$1.00");
		System.out.println("Hot Fudge:\t$1.00");
		System.out.println();

		System.out.print("What flavor would you like? ");
		prompt1 = neel.nextLine();

		if(prompt1.equals("chocolate")){
			cost +=2.50;
		}
		else{
			cost += 2.00;
		}

		System.out.print("Would you like sprinkles? ");
		prompt2 = neel.nextLine();

		if(prompt2.equals("yes")){
			cost += 1.00;
		}

		if((prompt1.equals("chocolate")) && (prompt2.equals("yes"))){
			System.out.print("Would you like hot fudge? ");
			prompt3 = neel.nextLine();
			if(prompt3.equals("yes")){
				cost += 1.00;
			}
		}

		System.out.println();

		System.out.println("Total: $" + cost);

		System.out.println();

	}
}