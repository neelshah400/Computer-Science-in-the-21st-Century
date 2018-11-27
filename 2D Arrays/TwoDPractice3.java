public class TwoDPractice3{
	public static void main(String[]args){

		String[][] x = new String[3][3];
		int num = 0;
		for(int row = 0; row < x.length; row++){
			for(int col = 0; col < x[row].length; col++){
				x[row][col] = "";
				num = col + 1;
				for(int a = 0; a < num; a++)
					x[row][col] += "*";
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}