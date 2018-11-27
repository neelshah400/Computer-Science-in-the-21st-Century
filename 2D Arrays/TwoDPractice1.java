public class TwoDPractice1{
	public static void main(String[]args){

		int[][] x = new int [4][6];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int row = 0; row < x.length; row++){
			for(int col = 0; col < x[row].length; col++){
				x[row][col] = (int)(Math.random() * 71) + 7;
				sum += x[row][col];
				if(x[row][col] > max)
					max = x[row][col];
				if(x[row][col] < min)
					min = x[row][col];
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum:\t" + sum);
		System.out.println("Max:\t" + max + "\t" + "Min:\t" + min + "\n");

	}
}