public class BinarySearchesYouTry{
	public static void main(String[]args){

		// Initialize Array
		int[] a = new int[20];
		for(int i = 0; i < a.length; i++)
			a[i] = (int)(Math.random() * 25) + 1;

		// Selection Sort
		for(int i = 0; i < a.length - 1; i++){
			int minIndex = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < a[minIndex])
					minIndex = j;
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}

		// Print Array
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n");

		// Binary Search
		int lo = 0;
		int hi = a.length - 1;
		int key = (int)(Math.random() * 25) + 1;
		boolean yes = false;
		while(lo <= hi){
			int mid = (lo + hi) / 2;
			if(a[mid] == key){
				yes = true;
				break;
			}
			else if(a[mid] < key)
				lo = mid + 1;
			else if(a[mid] > key)
				hi = mid - 1;
		}

		// Print Result
		if(yes == true)
			System.out.println(key + " is in the array.\n");
		else
			System.out.println(key + " is NOT in the array.\n");

	}
}