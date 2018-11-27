public class CountingPractice1{
	public static void main(String[]args){

		int x = 11;
		int y = 8;
		int z = 3;
		int counter = 0;

		System.out.println(x - y);
		counter ++;
		System.out.println(y % z);
		counter ++;
		System.out.println(z * x);
		counter ++;
		System.out.println(x / y);
		counter ++;
		System.out.println(x - y/3);
		counter ++;
		System.out.println(counter);

	}
}