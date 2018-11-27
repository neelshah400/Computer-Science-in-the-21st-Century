import java.util.Scanner;

public class DoWhileProgram1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Enter a value: ");
		int p = neel.nextInt();

		System.out.println();

		int n = 1;
		int test = p;

		while(test < (10000 / p)){
			n++;
			test *= p;
		}

		int i = 1;
		int output = 1;

		System.out.print("The powers of " + p + " that are less than 10000 are ");

		while(i <= n){
			i++;
			output *= p;
			System.out.print(output);
			if(i <= n)
				System.out.print(", ");
			if(i == n)
				System.out.print("and ");
		}

		System.out.println(".\n");



	}
}