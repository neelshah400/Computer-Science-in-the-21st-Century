public class DoWhileProgram2{
	public static void main(String[]args){

		int x = 1;
		int y = 10;
		int counter = 0;

		while(y != 0){
			if(x % 2 == 0)
				y /= (x + 1);
			else
				y += x;
			x++;
			counter++;
		}
		System.out.println(counter + "\n");

	}
}