import java.util.Scanner;

public class SwitchTest{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("ENTRANCE COST:");
		System.out.println();
		System.out.println("Monday:\t\t$5.00");
		System.out.println("Tuesday:\t$4.00");
		System.out.println("Wednesday:\t$3.00");
		System.out.println("All Other Days:\t$2.00");
		System.out.println();
		System.out.println("FOOD COST:");
		System.out.println();
		System.out.println("Hotdog:\t\t$2.00");
		System.out.println("Fries:\t\t$3.00");
		System.out.println("Apple Pie:\t$5.00");
		System.out.println("Ice Cream:\t$1.00\t(only with Apple Pie)");
		System.out.println();

		double cost = 0.0;
		String clause = "";
		System.out.print("What day would you like to visit the park? ");
		String day = neel.nextLine();
		System.out.print("What would you like to eat? ");
		String food = neel.nextLine();

		switch(day){
			case "Monday": cost += 5.00;
				break;
			case "Tuesday": cost += 4.00;
				break;
			case "Wednesday": cost += 3.00;
				break;
			default: cost += 2.00;
				break;
		}

		switch(food){
			case "Hotdog": cost += 2.00;
				break;
			case "Fries": cost += 3.00;
				break;
			case "Apple Pie":
				cost += 5.00;
				System.out.print("Would you like Ice Cream? ");
				String ice = neel.nextLine();
				if(ice.equals("Yes")){
					cost += 1.00;
					clause = " with Ice Cream";
				}
				else{
					cost += 0.00;
					clause = " without Ice Cream";
				}
				break;
			default: System.out.println("!ERROR!");
				break;
		}

		System.out.println("You visited the park on " + day + " and ordered " + food + clause + ". The total cost of the trip is $" + cost + ".");
		System.out.println();

	}
}