public class ForDoWhileConversions{
	public static void main(String[]args){

		// 1.
		int z = 0;
		for(int y = 0; y < 5; y++)
			z += y;
		System.out.println(z + "\n");

		// 2.
		int j = 1;
		int i = 2;
		while(i <= 12){
			j *= i;
			i += 3;
		}
		System.out.println(j + "\n");

	}
}