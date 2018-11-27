public class PhysicsPosition{
	public static void main(String[]args){

		double s_o = 12.0;
		double v_o = 3.5;
		double a = 9.8;
		int t = 10;

		double s = (s_o + (v_o * t) + (0.5 * a * t * t));

		System.out.println("s = " + s + " m");

	}
}