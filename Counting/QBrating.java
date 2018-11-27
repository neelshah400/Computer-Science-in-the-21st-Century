public class QBrating{
	public static void main(String[]args){

		//change variables for each player
		//currently using statistics for: Cam Newton

		int comp = 296;
		int att = 495;
		int yds = 3837;
		int td = 35;
		int in = 10;

		//do not change

		double a = (((((double)comp /att) * 100.0) - 30.0) / 20.0);
		double b = ((((double)td /att) * 100.0) / 5.0);
		double c = ((9.5 - (((double)in /att) * 100.0)) / 4.0);
		double d = ((((double)yds/att) - 3.0) / 4.0);

		double qb = ((a + b + c + d) / 0.06);

		System.out.println(qb);

	}
}