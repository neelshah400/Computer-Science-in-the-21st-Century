public class DoWhileYouTry{
	public static void main(String[]args){

		System.out.print("1. ");
		int number = 1;
		while(number < 10){
			System.out.print(number + " ");
			number++;
		}
		System.out.println();

		System.out.print("2. ");
		number = 6;
		while(number < 10){
			System.out.print(number + " ");
			number++;
		}
		System.out.println();

		System.out.print("3. ");
		number = 10;
		while(number > 0){
			System.out.print(number + " ");
			number--;
		}
		System.out.println();

		System.out.print("4. ");
		number = 0;
		while(number < 2){
			System.out.print(number + " ");
			number++;
		}
		System.out.println();

		System.out.print("5. ");
		number = 5;
		while(number < 35){
			System.out.print(number + " ");
			number += 5;
		}
		System.out.println("\n");

	}
}