public class RandomNumbersPractice3{
	public static void main(String[]args){

		int num6 = (int)(Math.random()*6)+1;
		int num10 = (int)(Math.random()*10)+1;
		int num20 = (int)(Math.random()*20)+1;

		System.out.println("6-Sided Die: " + num6);
		System.out.println("10-Sided Die: " + num10);
		System.out.println("20-Sided Die: " + num20);
		System.out.println("Sum of dice: " + (num6 + num10 + num20));
		System.out.println("Product of dice: " + (num6 * num10 * num20));
		System.out.println("Average of dice " + ((num6 + num10 + num20)/3.0));

	}
}