public class BinarySearchesNotes{
	public static void main(String[]args){

		int[] arr = {3, 67, -8, 0, 45, 2, -22, 70, 70, 7, 100};

		// Put your Selection Sort / Insertion Sort Code Here! VV
		
		for(int i = 1; i < arr.length; i++){
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}

		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");

		// Binary Search Follows Sorting

		int lo = 0;
		int hi = arr.length-1;
		int key = 36;
		boolean yes = false;

		while(lo <= hi){
			int mid = (lo+hi)/2;
			if(arr[mid] == key){
				yes = true;
				break;
			}
			else if(arr[mid] < key){
				lo = mid + 1;
			}
			else if(arr[mid] > key){
				hi = mid - 1;
			}
		}
		System.out.println("\n");

		if(yes == true)
			System.out.println(key+"  is in the array");
		else
			System.out.println(key+"  is NOT in the array");

	}
}