import java.util.Scanner;

public class SwitchPractice1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Please enter your weight on Earth (in pounds): ");
		double EarthWeight = neel.nextDouble();

		System.out.println();

		neel.nextLine();

		System.out.println("Planet Name\tRelative Force of Gravity");
		System.out.println("-----------------------------------------");
		System.out.println("Earth\t\t1.00");
		System.out.println("Jupiter\t\t2.65");
		System.out.println("Mars\t\t0.39");
		System.out.println("Mercury\t\t0.38");
		System.out.println("Neptune\t\t1.23");
		System.out.println("Pluto\t\t0.05");
		System.out.println("Saturn\t\t1.17");
		System.out.println("Uranus\t\t1.05");
		System.out.println("Venus\t\t0.78");

		System.out.println();

		System.out.print("Choose a planet from the menu above: ");
		String PlanetName = neel.nextLine();

		System.out.println();

		System.out.println("Your weight on earth is " + EarthWeight + " pounds.");
		System.out.print("Your weight on " + PlanetName + " would be ");

		switch(PlanetName){

			case "Earth": System.out.print(1.00 * EarthWeight);
				break;
			case "Jupiter": System.out.print(2.65 * EarthWeight);
				break;
			case "Mars": System.out.print(0.39 * EarthWeight);
				break;
			case "Mercury": System.out.print(0.38 * EarthWeight);
				break;
			case "Neptune": System.out.print(1.23 * EarthWeight);
				break;
			case "Pluto": System.out.print(0.05 * EarthWeight);
				break;
			case "Saturn": System.out.print(1.17 * EarthWeight);
				break;
			case "Uranus": System.out.print(1.05 * EarthWeight);
				break;
			case "Venus": System.out.print(0.78 * EarthWeight);
				break;
			default: System.out.print("!ERROR!");
				break;

		}

		System.out.println(" pounds.");

		System.out.println();

	}
}