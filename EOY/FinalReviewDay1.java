import java.util.Scanner;

public class FinalReviewDay1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		int response = 1;

		while(response != 0){

			System.out.print("Which program (0 to exit)?\t");
			response = neel.nextInt();
			System.out.println();

			switch(response){

			default:
				break;
			
			case 1:
				System.out.println("PROGRAM 1:\n");
				System.out.print(" - For Loop:\t\t\t");
				for(int a = 2; a <= 50; a += 2)
					System.out.print(a + " ");
				System.out.print("\n - While Loop:\t\t\t");
				int b = 2;
				while(b <= 50){
					System.out.print(b + " ");
					b += 2;
				}
				System.out.print("\n - Do While Loop:\t\t");
				int c = 2;
				do{
					System.out.print(c + " ");
					c += 2;
				}while(c <= 50);
				System.out.println("\n");
				break;
			
			case 2:
				System.out.println("PROGRAM 2:\n");
				System.out.println(" - For Loop:\n");
				int sumD = 0;
				for(int d = 0; d < 5; d++){
					System.out.print("\tPlease enter a number:\t");
					sumD += neel.nextInt();
				}
				System.out.println("\n\tSum of the numbers:\t" + sumD + "\n");
				System.out.println(" - While Loop:\n");
				int sumE = 0;
				int e = 0;
				while(e < 5){
					System.out.print("\tPlease enter a number:\t");
					sumE += neel.nextInt();
					e++;
				}
				System.out.println("\n\tSum of the numbers:\t" + sumE + "\n");
				System.out.println(" - Do While Loop:\n");
				int sumF = 0;
				int f = 0;
				do{
					System.out.print("\tPlease enter a number:\t");
					sumF += neel.nextInt();
					f++;
				}while(f < 5);
				System.out.println("\n\tSum of the numbers:\t" + sumF + "\n");
				break;
			
			case 3:
				System.out.println("PROGRAM 3:\n");
				System.out.println(" - Pattern A:\n");
				for(int g = 1; g < 5; g++){
					System.out.print("\t");
					for(int h = 0; h < g; h++)
						System.out.print("*");
					System.out.println();
				}
				System.out.println("\n - Pattern B:\n");
				int h = 1;
				while(h < 5){
					System.out.print("\t");
					for(int i = 0; i < 4; i++)
						System.out.print(h);
					System.out.println();
					h++;
				}
				System.out.println("\n - Pattern C:\n");
				int k = 1;
				for(int j = 4; j > 0; j--){
					System.out.print("\t");
					for(int l = 0; l < k; l++)
						System.out.print(j);
					System.out.println();
					k++;
					if(k > 4)
						break;
				}
				System.out.println("\n - Pattern D:\n");
				for(int l = 6; l < 10; l++){
					System.out.print("\t");
					for(int m = 9; m >= l; m--)
						System.out.print(m);
					System.out.println();
				}
				break;

			case 4:
				System.out.println("PROGRAM 4:\n");
				int[] arr1 = {1,2,3,4,5};
				int[] arr2 = {5,4,3,2,1};
				int[] arr3 = {7,8,9,4,5};
				System.out.println(" - Least to greatest:\t\t" + Program4(arr1));
				System.out.println(" - Greatest to least:\t\t" + Program4(arr2));
				System.out.println(" - Random order:\t\t" + Program4(arr3));
				System.out.println();
				break;
				
			case 5:
				System.out.println("PROGRAM 5:\n");
				Program5();
				System.out.println();
				break;
				
			case 6:
				System.out.println("PROGRAM 6:\n");
				int[] arrE = {0,2,4,6,8,10};
				int[] arrO = {1,3,5,7,9,11};
				int[] arrM = {0,1,2,3,4,5,6,7,8,9,10,11};
				System.out.println(" - Even numbers:\t\t" + Program6(arrE));
				System.out.println(" - Odd numbers:\t\t\t" + Program6(arrO));
				System.out.println(" - More than 10 numbers:\t" + Program6(arrM));
				System.out.println();
				break;
				
			case 7:
				System.out.println("PROGRAM 7:\n");
				int[] arrA = {1,2,3,4,5,6,7,8,9};
				int[] arrB = {9,8,7,6,5,4,3,2,1};
				int[] arrC = {7,8,9,4,5,6,1,2,3};
				System.out.println(" - Test A:\t\t\t" + Program7(arrA));
				System.out.println(" - Test B:\t\t\t" + Program7(arrB));
				System.out.println(" - Test C:\t\t\t" + Program7(arrC));
				System.out.println();
				break;

			}
		}
	}

	public static boolean Program4(int[] a){
		for(int o = 1; o < a.length; o++){
			if(a[o] < a[o - 1])
				return false;
		}
		return true;
	}

	public static void Program5(){
		System.out.print("\ta b c");
		System.out.print("\n");
		System.out.print("\td e f");
		System.out.print("\n");
		System.out.print("\tg\th");
		System.out.print("\n");
		System.out.print("\ti j\n");
	}

	public static int Program6(int[] a){
		int sum = 0;
		for(int p = 0; p < a.length; p++){
			if(a[p] % 2 == 0)
				sum += a[p];
		}
		if(a.length > 10)
			sum *= 2;
		return sum;
	}

	public static int Program7(int[] a){
		int sum = 0;
		int indices = 0;
		for(int q = 0; q < a.length; q++){
			if(q % 3 == 0){
				sum += a[q];
				indices++;
			}
		}
		int avg = sum / indices;
		return avg;
	}
}