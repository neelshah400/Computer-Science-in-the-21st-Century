// Suchit Peddireddy and Neel Shah

public class InsertionSortAttempt{
	public static void main(String[]args){

		int[] arr = {5, 8, 2, 6, 1, 10};
		int temp = 0;
		int counter = 0;

		while(counter != arr.length - 1){
			for(int j = 1; j < arr.length; j++){
				if(arr[j] < arr[j - 1]){
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					j = 1;
				}
				else
					counter++;
			}
		}

		for(int k = 0; k < arr.length; k++)
			System.out.print(arr[k]+" ");

		System.out.println();

	}
}