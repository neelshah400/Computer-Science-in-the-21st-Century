public class NestedIfNotes{
	public static void main(String[]args){

		// example 1 - after (see ppt for before)

		int num = 5;

		if(num > 0){
			if(num < 10)
				System.out.println("num is between 0 and 10");
			else
				System.out.println("Got here");
		}
		else
			System.out.println("Got here");

		// example 2 - after (see ppt for before)

		int a = 5;
		int b = 10;
		int c = 0;

		if(a >= b){
			if(a >= c)
				System.out.println("a is the greatest");
			else
				System.out.println("c is the greatest");
		}
		else{
			if(b >= c)
				System.out.println("b is the greatest");
			else
				System.out.println("c is the greatest");
		}

	}
}