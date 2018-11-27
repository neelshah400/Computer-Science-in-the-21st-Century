import java.util.Scanner;

public class BinarySearchesQuiz{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		String replay = "y";

		while(replay.equals("y")){

			// Difficulty Prompt
			System.out.print("How many numbers would you like the computer to generate in the array?\t");
			int n = neel.nextInt();

			// Key Prompt
			System.out.print("Guess a number between 1 and 25000:\t");
			int key = neel.nextInt();
			neel.nextLine();
			System.out.println("\nUnsorted Array:\n");

			// Initialize Array
			int[] a = new int[n];
			for(int b = 0; b < a.length; b++){
				a[b] = (int)(Math.random() * 25000) + 1;
				System.out.print(a[b] + "\t");
			}
			System.out.println("\n");

			// Selection Sort
			for(int i = 0; i < a.length - 1; i++){
				int minIndex = i;
				for(int j = i + 1; j < a.length; j++){
					if(a[j] < a[minIndex])
						minIndex = j;
				}
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}

			// Binary Search
			int lo = 0;
			int hi = a.length - 1;
			boolean correct = false;
			int score = 0;
			int index = 0;
			while(hi >= lo){
				int mid = (lo + hi) / 2;
				if(a[mid] == key){
					correct = true;
					score++;
					index = mid;
					break;
				}
				else if(a[mid] < key){
					lo = mid + 1;
				}
				else if(a[mid] > key){
					hi = mid - 1;
				}
			}

			// Print Sorted Array
			System.out.println("Sorted Array:\n");
			for(int c = 0; c < a.length; c++)
				System.out.print(a[c] + "\t");
			System.out.println("\n");

			// Response
			if(correct == true){
				System.out.print("You win! " + key + " was found at index " + index + " in the array. Would you like to play again (y/n)?\t");
				replay = neel.nextLine();
			}
			else{
				System.out.print("You lose! " + key + " was not found in the array. Your score was " + score + ".");
				replay = "n";
			}
			System.out.println("\n");

		}


	}
}