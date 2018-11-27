public class BinarySearchesProgram1{
	public static void main(String[]args){

		// Initialize Array
		int[] a = new int[1000];
		for(int i = 0; i < a.length; i++)
			a[i] = (int)(Math.random() * 10000) + 1;

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

		// Binary Search
		int lo = 0;
		int hi = a.length - 1;
		int key = (int)(Math.random() * 10000) + 1;
		int searches = 0;
		boolean yes = false;
		while(lo <= hi){
			int mid = (lo + hi) / 2;
			if(a[mid] == key){
				yes = true;
				searches++;
				break;
			}
			else if(a[mid] < key){
				lo = mid + 1;
				searches++;
			}
			else if(a[mid] > key){
				hi = mid - 1;
				searches++;
			}
		}

		// Print Result
		if(yes == true)
			System.out.println(key + " is in the array.");
		else
			System.out.println(key + " is NOT in the array.");
		System.out.println("The computer searched " + searches + " times.\n");

	}
}