public class ArraysPractice3{
	public static void main(String[]args){

		int[] n = new int[8];
		for(int i = 0; i < n.length; i++){
			n[i] = (i + 1);
			System.out.print(n[i] + " ");
		}
		System.out.println();

		int temp = 0;
		for(int i = 0; i < 4; i++){
			temp = n[i];
			n[i] = n[7 - i];
			n[7 - i] = temp;
		}
		for(int i = 0; i > 4 && i < n.length; i++){
			temp = n[7 - i];
			n[i] = temp;
		}

		for(int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println("\n");

	}
}