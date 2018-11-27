public class InsertionSortNotes{
	public static void main(String[]args){

		int[] a = {4, 6, 3, 0, 13, 2};

		for(int i = 1; i < a.length; i++ ){ // 1. START OFF AT 1

		    int j = i;	// 2. VALUE NEEDED FOR INNER LOOP SET EQUAL TO VALUE OF OUTER LOOP - KEEPS TRACK OF INDEX OF RIGHT MOST VALUE IN ARRAY WE ARE CHECKING DURING THAT ITERATION OF OUTER LOOP.

		    while(j > 0 && a[j] < a[j-1]){ // 3. TWO CONDITIONS REQUIRED TO MAKE THIS STATEMENT WORK! WHILE LOOPS ARE MORE SUFFICIENT FOR THIS KIND OF PROCESS BECAUSE IT WILL ONLY WORK AS LONG AS THE CONDITION IS MET.
				int temp = a[j]; // 4. USE TEMP TO SWITCH VALUES.
				a[j] = a[j-1];
				a[j-1] = temp;
				j--; // 5. NECESSARY TO GIVE INCREMEMNTS IN LOOP SO THAT IT MAY KEEP ON RUNNING
		    }
		
		}
		
		for(int k = 0; k < a.length; k++)
			System.out.print(a[k]+" ");
	}
}