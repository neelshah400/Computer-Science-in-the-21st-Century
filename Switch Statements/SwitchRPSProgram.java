import java.util.Scanner;

public class SwitchRPSProgram{
	public static void main(String[]args){

		// Initial
		Scanner neel = new Scanner(System.in);
		int round = 1;

		int range = 0;
		int start = 0;

		System.out.print("Enter a difficulty level: ");
		String difficulty = neel.nextLine();
		System.out.println();
		if(difficulty.equals("Medium")){ // 50% chance of winning
			range = 3;
			start = 1;
		}
		else if(difficulty.equals("Easy")){ // 85% chance of winning
			range = 20;
			start = -16;
		}
		else{ // 15% chance of winning
			range = 20;
			start = 4;
		}

		int playerScore = 0;
		int CPUScore = 0;
		String CPU = "";
		int randCPU = 0;
		String player = "";

		// Round 1
		System.out.println("Round " + round);
		System.out.print("Enter a RPS throw: ");
		player = neel.nextLine();
		System.out.print("Computer selects: ");
		randCPU = (int)(Math.random()*range)+start;
		switch(randCPU){
			case 1: CPU = "Rock";
				break;
			case 2: CPU = "Paper";
				break;
			case 3: CPU = "Scissors";
				break;
			default:
				if(difficulty.equals("Medium"))
					CPU = "!ERROR!";
				else if(difficulty.equals("Hard")){
					if(player.equals("Rock"))
						CPU = "Paper";
					else if(player.equals("Paper"))
						CPU = "Scissors";
					else
						CPU = "Rock";
				}
				else if(difficulty.equals("Easy")){
					if(player.equals("Rock"))
						CPU = "Scissors";
					else if(player.equals("Paper"))
						CPU = "Rock";
					else
						CPU = "Paper";
				}
				else
					CPU = "!ERROR!";
				break;
		}
		System.out.println(CPU);
		if(player.equals(CPU))
			System.out.println("Tie!");
		else{
			if((player.equals("Rock") && CPU.equals("Scissors")) || (player.equals("Paper") && CPU.equals("Rock")) || (player.equals("Scissors") && CPU.equals("Paper"))){
				System.out.println("You Win!");
				playerScore++;
			}
			else{
				System.out.println("Computer Wins!");
				CPUScore++;
			}
		}
		System.out.println();
		round++;

		// Round 2
		System.out.println("Round " + round);
		System.out.print("Enter a RPS throw: ");
		player = neel.nextLine();
		System.out.print("Computer selects: ");
		randCPU = (int)(Math.random()*range)+start;
		switch(randCPU){
			case 1: CPU = "Rock";
				break;
			case 2: CPU = "Paper";
				break;
			case 3: CPU = "Scissors";
				break;
			default:
				if(difficulty.equals("Medium"))
					CPU = "!ERROR!";
				else if(difficulty.equals("Hard")){
					if(player.equals("Rock"))
						CPU = "Paper";
					else if(player.equals("Paper"))
						CPU = "Scissors";
					else
						CPU = "Rock";
				}
				else if(difficulty.equals("Easy")){
					if(player.equals("Rock"))
						CPU = "Scissors";
					else if(player.equals("Paper"))
						CPU = "Rock";
					else
						CPU = "Paper";
				}
				else
					CPU = "!ERROR!";
				break;
		}
		System.out.println(CPU);
		if(player.equals(CPU))
			System.out.println("Tie!");
		else{
			if((player.equals("Rock") && CPU.equals("Scissors")) || (player.equals("Paper") && CPU.equals("Rock")) || (player.equals("Scissors") && CPU.equals("Paper"))){
				System.out.println("You Win!");
				playerScore++;
			}
			else{
				System.out.println("Computer Wins!");
				CPUScore++;
			}
		}
		System.out.println();
		round++;

		// Round 3
		System.out.println("Round " + round);
		System.out.print("Enter a RPS throw: ");
		player = neel.nextLine();
		System.out.print("Computer selects: ");
		randCPU = (int)(Math.random()*range)+start;
		switch(randCPU){
			case 1: CPU = "Rock";
				break;
			case 2: CPU = "Paper";
				break;
			case 3: CPU = "Scissors";
				break;
			default:
				if(difficulty.equals("Medium"))
					CPU = "!ERROR!";
				else if(difficulty.equals("Hard")){
					if(player.equals("Rock"))
						CPU = "Paper";
					else if(player.equals("Paper"))
						CPU = "Scissors";
					else
						CPU = "Rock";
				}
				else if(difficulty.equals("Easy")){
					if(player.equals("Rock"))
						CPU = "Scissors";
					else if(player.equals("Paper"))
						CPU = "Rock";
					else
						CPU = "Paper";
				}
				else
					CPU = "!ERROR!";
				break;
		}
		System.out.println(CPU);
		if(player.equals(CPU))
			System.out.println("Tie!");
		else{
			if((player.equals("Rock") && CPU.equals("Scissors")) || (player.equals("Paper") && CPU.equals("Rock")) || (player.equals("Scissors") && CPU.equals("Paper"))){
				System.out.println("You Win!");
				playerScore++;
			}
			else{
				System.out.println("Computer Wins!");
				CPUScore++;
			}
		}
		System.out.println();
		round++;

		//Result
		System.out.print("Result: ");
		if(playerScore == CPUScore)
			System.out.println("Tie!");
		else if(playerScore > CPUScore)
			System.out.println("You Win!");
		else
			System.out.println("Computer Wins!");

	}
}