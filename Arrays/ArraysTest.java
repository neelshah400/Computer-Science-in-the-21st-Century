public class ArraysTest{
	public static void main(String[]args){

		int[] array = new int[20];
		int sum = 0;
		double average = 0.0;
		int min = Integer.MAX_VALUE;

		for(int i = 1; i <= array.length; i++){
			array[i - 1] = (int)(Math.random()*39) + 13;
			System.out.print(array[i - 1] + " ");
			if(i % 5 == 0)
				System.out.println();
			sum += array[i - 1];
			if(array[i - 1] < min)
				min = array[i - 1];
		}

		System.out.println("Sum:\t\t" + sum);
		average = (double)sum / (double)array.length;
		System.out.println("Average:\t" + average);
		System.out.println("Min:\t\t" + min + "\n");

	}
}