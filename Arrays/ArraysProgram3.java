public class ArraysProgram3{
	public static void main(String[]args){

		int array[] = new int[5];
		int sum = 0;
		int min = 101;
		int max = 0;

		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100)+1;
			System.out.print(array[i] + " ");
			sum += array[i];
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
		System.out.println("\n");

		System.out.println("Sum: " + sum);
		System.out.println("Smallest value: " + min);
		System.out.println("Largest value: " + max + "\n");

	}
}