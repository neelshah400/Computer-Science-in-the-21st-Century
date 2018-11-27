public class MethodParameterNotes{
	public static void main(String[]args){

		int ira = 4;
		int arnitha = 7;

		int sum1 = numberAdder(ira, arnitha);

		System.out.println(sum1);

	}

	public static int numberAdder(int ira, int arnitha){

		int sum = ira + arnitha;
		return sum;

	}
}