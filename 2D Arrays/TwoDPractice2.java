public class TwoDPractice2{
	public static void main(String[]args){

		int[][] x = new int[5][4];
		x[0][0] = 4;
		x[0][1] = 9;
		x[0][2] = 4;
		x[0][3] = 25;
		for(int row = 0; row < x.length; row++){
			for(int col = 0; col < x[row].length; col++){
				if(row > 0)
					x[row][col] = x[row - 1][col] * (col + 2);
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}