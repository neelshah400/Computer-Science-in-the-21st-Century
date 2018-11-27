public class BinarySearchesProgram3{
	public static void main(String[]args){

		// Initialize Array
		int[] a = new int[1000];
		for(int i = 0; i < a.length; i++)
			a[i] = (int)(Math.random() * 10000) + 1;
		int counter = 0;
		int searches = 0;

		for(int b = 0; b < 100; b++){

			// Regular Search
			int key = (int)(Math.random() * 10000) + 1;
			for(int i = 0; i < a.length; i++){
				if(a[i] == key){
					counter++;
					break;
				}
				else
					counter++;
			}

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
			while(lo <= hi){
				int mid = (lo + hi) / 2;
				if(a[mid] == key){
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

		}

		double avg_counter = (double)counter / 100.0;
		double avg_searches = (double)searches / 100.0;

		// Result
		System.out.println("Average regular searches:\t" + avg_counter);
		System.out.println("Average binary searches:\t" + avg_searches + "\n");

	}
}