public class RandomNumbersPractice2{
	public static void main(String[]args){

		int num1 = (int)(Math.random()*20)+1;
		System.out.println("First num: " + num1);

		int num2 = (int)(Math.random()*13)+6;
		System.out.println("Second num: " + num2);

		int num3 = (int)(Math.random()*177)+38;
		System.out.println("Third num: " + num3);

		int sum = num1 + num2 + num3;
		System.out.println("Sum of nums: " + sum);

		double avg = sum / 3.0;
		System.out.println("Average of nums: " + avg);

		int quotient = num1/num2;
		System.out.println("Quotient of first/second: " + quotient);

		int remainder = num3 % num1;
		System.out.println("Remainder of third mod first: " + remainder);

	}
}