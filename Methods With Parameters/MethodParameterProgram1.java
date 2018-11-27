public class MethodParameterProgram1{
	public static void main(String[]args){

		String first = "Neel";
		String last = "Shah";

		String name1 = nameAdder(first, last);

		System.out.println(name1);

	}

	public static String nameAdder(String first, String last){

		String nameAdder = first + " " + last;
		return nameAdder;

	}
}