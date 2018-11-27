import java.util.Scanner;

public class ParallelArraysProgram2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		String[] first = new String[6];
		String[] last = new String[6];
		int[] id = new int[6];
		int[] earned = new int[6];
		int[] possible = new int[6];
		int[] percent = new int[6];

		for(int i = 0; i < first.length; i++){
			System.out.print("First Name:\t\t");
			first[i] = neel.nextLine();
			System.out.print("Last Initial:\t\t");
			last[i] = neel.nextLine();
			System.out.print("Student ID #:\t\t");
			id[i] = neel.nextInt();
			System.out.print("Points Earned:\t\t");
			earned[i] = neel.nextInt();
			System.out.print("Points Possible:\t");
			possible[i] = neel.nextInt();
			percent[i] = (int)((Math.round(((double)earned[i] / (double)possible[i]) * 100.0)));
			neel.nextLine();
			System.out.println();
		}

		for(int j = 0; j < first.length; j++){
			System.out.print(first[j]);
			System.out.print(first[j].length() < 8 ? "\t\t" : "\t");
			System.out.print(last[j]);
			System.out.print(last[j].length() < 8 ? "\t\t" : "\t");
			System.out.print(id[j]);
			System.out.print(calc(id[j]) < 8 ? "\t\t" : "\t");
			System.out.print(earned[j]);
			System.out.print(calc(earned[j]) < 8 ? "\t\t" : "\t");
			System.out.print(possible[j]);
			System.out.print(calc(possible[j]) < 8 ? "\t\t" : "\t");
			System.out.print(percent[j]);
			System.out.println("%");
		}

		System.out.println();

	}

	public static int calc(int num){

		int length = 0;
		int mult = 1;
		while(mult <= num){
			length++;
			mult*= 10;
		}
		return length;

	}
}