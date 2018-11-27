public class ArrayNotes{
	public static void main(String[]args){

		// Example 1A
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
		System.out.println();

		// Example 1B
		int[] array2 = new int[10];
		for(int k = 0; k < array2.length; k++){
			array2[k] = (k+1);
			System.out.print(array2[k] + " ");
		}
		System.out.println();

		// Example 2
		int[] array3 = new int[5];
		int sum = 0;
		for(int j = 0; j < array3.length; j++){
			array3[j] = (int)(Math.random()*11)+5;
			System.out.print(array3[j] + " ");
			sum += array3[j];
		}
		System.out.println("\n"+sum+"\n");

	}
}