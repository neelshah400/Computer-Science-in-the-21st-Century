public class ArraysPractice2{
	public static void main(String[]args){

		int[] n = new int[10];
		double sum = 0;
		for(int i = 0; i < n.length; i++){
			n[i] = (i + 4);
			System.out.print(n[i] + " ");
			sum += n[i];
		}
		System.out.println("\nAverage: " + (sum / n.length) + "\n");

	}
}