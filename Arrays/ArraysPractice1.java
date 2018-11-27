public class ArraysPractice1{
	public static void main(String[]args){

		int[] n = new int[6];
		for(int i = 0; i < n.length; i++){
			n[i] = (int)(Math.random()*20)+1;
			System.out.print(n[i] + " ");
		}
		System.out.println();

		int temp = n[3];
		n[3] = n[4];
		n[4] = temp;
		for(int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println("\n");

	}
}