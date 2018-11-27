public class ArraySwapValueNotes{
	public static void main(String[]args){

		int[] n = {1, 2, 3, 4, 5};

		for(int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();

		int temp = n[0];
		n[0] = n[4];
		n[4] = temp;

		for(int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println("\n");

	}
}