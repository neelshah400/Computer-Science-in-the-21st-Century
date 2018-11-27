public class Newton{
	public static void main(String[]args){

		int y = 100;
		double step = (int)(y / 2);
		int i = 0;

		System.out.println("Value to estimate square root: " + y);
		System.out.println("Initial guess: " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		step = (1.0 / 2.0) * ((y / step) + step);
		i++;
		System.out.println("Step " + i + ": " + step);

		System.out.println();
		System.out.println("Best estimate after " + i + " iterations: " + step);

	}
}