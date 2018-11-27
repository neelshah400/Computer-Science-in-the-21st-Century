public class Converter{
	public static void main(String[]args){

	//Part 1

		int f = 88;
		double c = ((5.0/9.0)*(f-32.0));

		System.out.print("Part 1: " + c + " degrees celsius\n\n");

	//Part 2

		double T = 2.8;
		double g = 9.8;
		double pi = 3.1416;
		double L = ((T*T)/(4*pi*pi)*g);

		System.out.print("Part 2: " + L + " meters\n\n");

	//Part 3

		double fl = 20.2;
		double v = 68.5;
		double u = ((-1*fl*v)/(fl-v));

		System.out.print("Part 3: " + u + " cm\n\n");
	}
}