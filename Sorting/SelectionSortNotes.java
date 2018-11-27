public class SelectionSortNotes{
	public static void main(String[]args){

		int[] arr = {5, 8, 2, 6, 1, 18, 12};

		for(int i = 0; i < arr.length - 1; i++){

			int minIndex = i; // 1. OUTER LOOP KEEPS TRACK OF INDEX OF ELEMENT WE ARE CHECKING

			for(int j = i + 1; j < arr.length; j++){ // 2. LOCATES THE SMALLEST ELEMENT BETWEEN i AND THE END OF THE ARRAY.

				if(arr[j] < arr[minIndex]) // 3. SAVES THE INDEX OF OUR MINIMUM VALUE TO BE OUR NEW MIN INDEX
					minIndex = j;

			}

			int temp = arr[i]; // 4. TEMP VARIABLE ALLOWS US TO SWAP VALUES IN THE ARRAY USING INDICES
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

		for(int k = 0; k < arr.length; k++)
			System.out.print(arr[k]+" ");

	}
}