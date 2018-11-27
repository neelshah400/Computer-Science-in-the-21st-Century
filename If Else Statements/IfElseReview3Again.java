import java.util.Scanner;

public class IfElseReview3Again{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Would you like (F)rench Fries or (I)ce Cream? ");
		String food = neel.nextLine();
		System.out.print("Would you like (S)oda or (L)emonade? ");
		String drink = neel.nextLine();

		double cost = 0.0;

		if(food.equals("F")){
			System.out.print("Your order is 1 French Fry and 1 ");
			cost += 5.00;
		}
		else{
			System.out.print("Your order is 1 Ice Cream and 1 ");
			cost += 3.75;
		}
		if(drink.equals("S")){
			System.out.print("Soda. The price is $");
			cost += 2.25;
		}
		else{
			System.out.print("Lemonade. The price is $");
			cost += 3.50;
		}

		cost *= 1.07;

		System.out.print(cost + "." + "\n\n");

	}
}