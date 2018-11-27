import java.util.Scanner;

public class ParallelArraysNotes{
	public static void main(String[] args){

		Scanner neel = new Scanner(System.in);

		/*
		String[] last = {"Robles", "Dixit", "Rastogi", "Tadi", "Shah"};
		String[] initial = {"A", "I", "R", "N", "N"};
		int[] grade = {12, 10, 9, 10, 12};
		double[] gpa = {4.0, 4.0, 5.0, 3.0, 4.0};
		*/

		String[] last = new String[5];
		String[] initial = new  String[5];
		int[] grade = new int[5];
		double[] gpa = new double[5];

		for(int j = 0; j < grade.length; j++){
			System.out.println("Student #"+(j+1));
			System.out.println("Last Name: ");
			last[j] = neel.nextLine();
			System.out.println("First Initial: ");
			initial[j] = neel.nextLine();
			System.out.println("Grade Level: ");
			grade[j] = neel.nextInt();
			System.out.println("GPA: ");
			gpa[j] = neel.nextDouble();
			neel.nextLine(); // IMPORTANT
			System.out.println();
		}

		for(int i = 0; i < last.length; i++){
			System.out.println(last[i]+"\t"+initial[i]+"\t"+grade[i]+"\t"+gpa[i]);
			System.out.println();
		}

	}
}