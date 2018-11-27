import java.util.Scanner;

public class ArraysProgram2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		String array[] = new String[6];
		for(int i = 0; i < array.length; i++){
			System.out.print("Enter a name: ");
			array[i] = neel.nextLine();
		}
		System.out.println();
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("\n");

	}
}