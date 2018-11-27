import java.util.Scanner;

public class ParallelArraysProgram1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		int[] number = new int[5];
		String[] street = new String[5];
		String[] apartment = new String[5];
		int[] zipcode = new int[5];

		for(int i = 0; i < number.length; i++){
			System.out.print("Number:\t\t");
			number[i] = neel.nextInt();
			neel.nextLine();
			System.out.print("Street:\t\t");
			street[i] = neel.nextLine();
			System.out.print("Apartment:\t");
			apartment[i] = neel.nextLine();
			System.out.print("Zip Code:\t");
			zipcode[i] = neel.nextInt();
			neel.nextLine();
			System.out.println();
		}

		for(int j = 0; j < number.length; j++){
			System.out.print(number[j] + " " + street[j] + " ");
			System.out.print(!apartment[j].equals("-") ? apartment[j] + " " : "");
			System.out.println(zipcode[j]);
		}

		System.out.println();

	}
}