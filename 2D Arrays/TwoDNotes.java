public class TwoDNotes{
	public static void main(String[]args){

		//Example 1
		System.out.println("//Example 1\n");
		int[][] table = new int[4][5];
		System.out.println(table.length);
		System.out.println(table[3].length + "\n");
		int i = 0;
		for(int row = 0; row < table.length; row++){
			for(int col = 0; col < table[row].length; col++){
				i++;
				table[row][col] = i;
				System.out.print(table[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//Example 2
		System.out.println("//Example 2\n");
		int[][] table2 = new int[3][5];
		int sum = 0;
		int max = 0;
		for(int row = 0; row < table2.length; row++){
			for(int col = 0; col < table2[row].length; col++){
				table2[row][col] = (int)(Math.random() * 50) + 1;
				sum += table2[row][col];
				if(table2[row][col] > max)
					max = table2[row][col];
				System.out.print(table2[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(sum + "\n");
		System.out.println(max + "\n");

		//Example 3
		System.out.println("//Example 3\n");
		int[][] table3a = new int[10][10];
		for(int row = 0; row < table3a.length; row++){
			for(int col = 0; col < table3a[row].length; col++){
				table3a[row][col] = col;
				System.out.print(table3a[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int[][] table3b = new int[10][10];
		for(int row = 0; row < table3b.length; row++){
			for(int col = 0; col < table3a[row].length; col++){
				table3b[row][col] = col + 1;
				System.out.print(table3b[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}