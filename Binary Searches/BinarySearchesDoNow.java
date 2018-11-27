public class BinarySearchesDoNow{
	public static void main(String[]args){

		int[] a = new int[100];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random() * 1000) + 1;
			System.out.print(a[i] + "\t");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
		boolean check = false;
		for(int i = 0; i < a.length; i++){
			if(a[i] == 100)
				check = true;
		}
		if(check == true)
			System.out.println("The number 100 is in the array.\n");
		else
			System.out.println("The number 100 is NOT in the array.\n");

	}
}