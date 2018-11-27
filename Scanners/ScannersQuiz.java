import java.util.Scanner;

public class ScannersQuiz{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		// Student 1

		System.out.print("Enter the first student's name: ");
		String name1 = neel.nextLine();

		System.out.print("Enter the grade for tests/quizzes: ");
		int tests1 = neel.nextInt();

		System.out.print("Enter the grade for projects: ");
		int projects1 = neel.nextInt();

		System.out.print("Enter the grade for participation: ");
		int participation1 = neel.nextInt();

		System.out.print("Enter the grade for homework: ");
		int homework1 = neel.nextInt();

		double grade1 = ((0.60 * tests1) + (0.15 * projects1) + (0.15 * participation1) + (0.10 * homework1));

		neel.nextLine();

		System.out.println();

		// Student 2

		System.out.print("Enter the second student's name: ");
		String name2 = neel.nextLine();

		System.out.print("Enter the grade for tests/quizzes: ");
		int tests2 = neel.nextInt();

		System.out.print("Enter the grade for projects: ");
		int projects2 = neel.nextInt();

		System.out.print("Enter the grade for participation: ");
		int participation2 = neel.nextInt();

		System.out.print("Enter the grade for homework: ");
		int homework2 = neel.nextInt();

		double grade2 = ((0.60 * tests2) + (0.15 * projects2) + (0.15 * participation2) + (0.10 * homework2));

		System.out.println();

		// Output

		System.out.println("Name\t\tTests/Quizzes\tProjects\tParticipation\tHomework\tFinal Grade");
		System.out.println();
		System.out.println(name1 + "\t" + tests1 + "\t\t" + projects1 + "\t\t" + participation1 + "\t\t" + homework1 + "\t\t" + grade1);
		System.out.println();
		System.out.println(name2 + "\t" + tests2 + "\t\t" + projects2 + "\t\t" + participation2 + "\t\t" + homework2 + "\t\t" + grade2);
		System.out.println();

	}
}