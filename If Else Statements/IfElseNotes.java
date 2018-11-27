public class IfElseNotes{
	public static void main(String[]args){

		int a = 5, b = 27, c = 5;

		if(a==5)
			System.out.println("a is equal to 5");
		//if(a!= 5)
		//	System.out.println("a is not equal to 5");
		else
			System.out.println("a is not equal to 5");

		//2
		if(b > 0){
			System.out.println("b is positive");
			System.out.println("+"); //brackets
		}
		else if(b == 0)
			System.out.println("b is zero");
		else //or else if (b < 0)
			System.out.println("b is negative");
		System.out.println("This statement will always execute");

		//3
		boolean nandan = true;
		boolean neel = false;
		if(nandan == true){
			System.out.println("Nandan is awesome");
			if(nandan == true)
				System.out.println("Nandan is super");
		}
		else
			System.out.println("Nandan is super");

		// && AND
		// || OR
		// Read from left to right

		if(a == b && b == c || a == c)
			System.out.println("They are equal");
		else if (a == b || b == c || a == c)
			System.out.println("At least one is equal");
		else
			System.out.println("No values are equal");

	}
}