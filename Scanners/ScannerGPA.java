import java.util.Scanner;

public class ScannerGPA{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

			//name

			System.out.print("Please enter the name of the student: ");
			String name = neel.nextLine();

			System.out.println();

			//class1

			System.out.print("Please enter the name of the first class: ");
			String class1 = neel.nextLine();

			System.out.print("How many credits is this course worth: ");
			double credits1 = neel.nextDouble();

			System.out.print("How many grade points did you earn: ");
			double grade1 = neel.nextDouble();

			neel.nextLine();

			System.out.println();

			//class2

			System.out.print("Please enter the name of the second class: ");
			String class2 = neel.nextLine();

			System.out.print("How many credits is this course worth: ");
			double credits2 = neel.nextDouble();

			System.out.print("How many grade points did you earn: ");
			double grade2 = neel.nextDouble();

			neel.nextLine();

			System.out.println();

			//class3

			System.out.print("Please enter the name of the third class: ");
			String class3 = neel.nextLine();

			System.out.print("How many credits is this course worth: ");
			double credits3 = neel.nextDouble();

			System.out.print("How many grade points did you earn: ");
			double grade3 = neel.nextDouble();

			neel.nextLine();

			System.out.println();

			//output

			System.out.println(name);
			System.out.println();
			System.out.println("Class\t\t\tCredits\t\t\tGrade Points");
			System.out.println();
			System.out.println(class1 + "\t\t\t" + credits1 + "\t\t\t" + grade1);
			System.out.println(class2 + "\t\t\t" + credits2 + "\t\t\t" + grade2);
			System.out.println(class3 + "\t" + credits3 + "\t\t\t" + grade3);
			System.out.println();
			System.out.println(((credits1 * grade1) + (credits2 * grade2) + (credits3 * grade3)) / (credits1 + credits2 + credits3));
			System.out.println();

	}
}