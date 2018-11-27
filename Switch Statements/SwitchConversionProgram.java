import java.util.Scanner;

public class SwitchConversionProgram{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("Available conversion units:");
		System.out.println(" - Millimeters");
		System.out.println(" - Centimeteres");
		System.out.println(" - Meters");
		System.out.println(" - Kilometers");
		System.out.println(" - Inches");
		System.out.println(" - Feet");
		System.out.println(" - Yards");
		System.out.println(" - Miles");
		System.out.println();

		System.out.print("Please enter what units you are starting with: ");
		String start = neel.nextLine();
		System.out.print("Please enter what units you would like to convert into: ");
		String end = neel.nextLine();
		System.out.print("Please enter how many " + start + ": ");
		double vala = neel.nextDouble();
		System.out.println();

		double valb = 0.0;
		double valc = 0.0;

		switch(start){
			case "Millimeters": valb = vala / 1000.0;
				break;
			case "Centimeters": valb = vala / 100.0;
				break;
			case "Meters": valb = vala * 1.0;
				break;
			case "Kilometers": valb = vala * 1000.0;
				break;
			case "Inches": valb = vala * 0.0254;
				break;
			case "Feet": valb = vala * 0.3048;
				break;
			case "Yards": valb = vala * 0.9144;
				break;
			case "Miles": valb = vala * 1609.34;
				break;
			default: System.out.println("!ERROR!");
				break;
		}

		switch(end){
			case "Millimeters": valc = valb * 1000.0;
				break;
			case "Centimeters": valc = valb * 100.0;
				break;
			case "Meters": valc = valb / 1.0;
				break;
			case "Kilometers": valc = valb / 1000.0;
				break;
			case "Inches": valc = valb / 0.0254;
				break;
			case "Feet": valc = valb / 0.3048;
				break;
			case "Yards": valc = valb / 0.9144;
				break;
			case "Miles": valc = valb / 1609.34;
				break;
			default: System.out.println("!ERROR!");
				break;
		}

		System.out.println(vala + " " + start + " is equal to " + valc + " " + end + ".");
		System.out.println();

	}
}