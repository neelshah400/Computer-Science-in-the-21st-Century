// Neel Shah

// Does not work

public class SelectionSortAttempt{
	public static void main(String[]args){

		/*
		Description:

		In the process of selection sort, the computer compares the first number
		in an array with the numbers past it. When an item meets certain conditions
		(e.g. less than or greater than the number). it switches the 2 numbers.
		Afterwards, it moves onto the next number, and repeats the process. This
		keeps going on until the whole array is sorted.

		*/

		int[] example = {5, 6, 7, 2, 4, 3, 0, -1};
		for(int i = 0; i < example.length; i++)
			System.out.print(example[i] + "\t");
		System.out.println();
		for(int i = 0; i < example.length; i++)
			System.out.print(ascending(example)[i] + "\t");
		System.out.println();

	}

	public static int[] ascending(int[] array){

		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		int temp = 0;

		for(int i = 0; i < array.length; i++){
			for(int j = (i + 1); j < array.length; j++){
				if(array[j] < min){
					min = array[j];
					minIndex = j;
				}
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;

		}

		return array;

	}

}