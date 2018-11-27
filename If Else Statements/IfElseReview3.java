import java.util.Scanner;

public class IfElseReview3{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Would you like (F)rench Fries or (I)ce Cream? ");
		String food = neel.nextLine();
		System.out.print("Would you like (S)oda or (L)emonade? ");
		String drink = neel.nextLine();
		double price = 0.0;
		System.out.println();

		order(food, drink, price);

		System.out.println();

	}

	public static void order(String a, String b, double c){

		c = 0.0;
		System.out.print("Your order is 1 ");
		if(a.equals("F")){
			System.out.print("French Fry");
			c += 5.00;
		}
		else{
			System.out.print("Ice Cream");
			c += 3.75;
		}
		System.out.print(" and 1 ");
		if(a.equals("S")){
			System.out.print("Soda");
			c += 2.25;
		}
		else{
			System.out.print("Lemonade");
			c += 3.50;
		}
		c *= 1.07;
		System.out.println(". The price is $" + c + ".");

	}

}