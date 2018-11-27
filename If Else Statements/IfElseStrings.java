public class IfElseStrings{
	public static void main(String[]args){

	String name = "Ms. Robles";
	String name2 = "Alexandria";
	String name3 = "Robles";
	String name4 = "robles";

	// == CANNOT be use to check if Strings are equal
	// The conditions we will make will be true statements as long as the two Strings are spelled and spaced the exact SAME WAY. In addition, they MUST HAVE the same Capitalization.

	//1 - Check that a variable has a specific String value
	if(name.equals("Ms. Robles"))
		System.out.println("That's my name!");
	else
		System.out.println("That's not my name!");

	//2 - Checks the specific String value to a variable.
	if("Alexandria".equals(name2))
		System.out.println("That's my name!");
	else
		System.out.println("That's not my name!");

	//3 - Check that a String variable equals another String variable
	if(name2.equals(name3))
		System.out.println("That's my name!");
	else
		System.out.println("That's not my name!");

	//Check when String is NOT(!) equal
	if(!name4.equals("Ms. Robles"))
		System.out.println("That's not my name!");

	//To Ignore Capitalization
	//equalsIgnoreCase
	if("Robles".equalsIgnoreCase("robles"))
		System.out.println("Same");
	else
		System.out.println("Not the same");
	}
}