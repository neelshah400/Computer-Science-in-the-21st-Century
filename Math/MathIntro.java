public class MathIntro{
	public static void main(String[]args){

		int i = 2;
		//you can't set a decimal value to an int
		int j = 11;
		double k = 4.1;
		double m = 6;
		//you can set a whole number value to a double

		System.out.println(i-j);
		System.out.println(k+m);
		System.out.println(j+m);
		//double will override in operations
		System.out.println(i+4.0);
		System.out.println((double)i+j);
		System.out.println((int)m+(int)k);
		//casting a double as an int DOES NOT round
		//it just drops the decimal place
		System.out.println((int)(m+k));
		System.out.println(j/i);
		System.out.println(m/i);
		System.out.println(200%7.0);

		i = j-3;
		System.out.println(i);
		int sum = i+j;
		double avg = sum/2.0;
	}
}