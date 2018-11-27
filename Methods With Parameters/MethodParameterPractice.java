public class MethodParameterPractice{
	public static void main(String[]args){

		int a = 2;
		int b = 3;
		int c = 4;
		int d = 5;
		int e = 6;

		double quotient = divider(a, b);
		double average = averager(a, b, c, d, e);
		double power1 = raiser1(a);
		double power2 = raiser2(a);

		System.out.println(quotient);
		System.out.println(average);
		System.out.println(power1);
		System.out.println(power2);

	}

	public static double divider(int a, int b){

		double divider = ((double)a / (double)b);
		return divider;

	}

	public static double averager(int a, int b, int c, int d, int e){

		double averager = ((double)a + (double)b + (double)c + (double)d + (double)e) / 5;
		return averager;

	}

	public static int raiser1(int a){

		int raiser1 = (a * a * a * a);
		return raiser1;

	}

	public static double raiser2(int a){

		double raiser2 = ((double)a * (double)a * (double)a * (double)a);
		return raiser2;

	}
}