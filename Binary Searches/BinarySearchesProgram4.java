import java.util.Scanner;

public class BinarySearchesProgram4{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);
		int score = 0;
		String choice = "y";

		while(choice.equals("y")){
			System.out.print("Choose a number between 1 and 100:\t");
			int key = neel.nextInt();

			// Initialize Array
			int[] a = new int[10];
			for(int i = 0; i < a.length; i++)
				a[i] = (int)(Math.random() * 100) + 1;

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
			int searches = 0;
			boolean yes = false;
			while(lo <= hi){
				int mid = (lo + hi) / 2;
				if(a[mid] == key){
					yes = true;
					searches++;
					break;
				}
				else if(a[mid] < key){
					lo = mid + 1;
					searches++;
				}
				else if(a[mid] > key){
					hi = mid - 1;
					searches++;
				}
			}

			// Print Result
			if(yes == true){
				score++;
				System.out.print("Correct! Your score is " + score  + ". Would you like to play again (y/n)?\t");
			}
			else
				System.out .print("Incorrect! Your score is " + score + ". Would you like to play again (y/n)?\t");

			neel.nextLine();
			choice = neel.nextLine();

		}

	}
}