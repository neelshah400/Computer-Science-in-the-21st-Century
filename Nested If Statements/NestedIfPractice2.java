import java.util.Scanner;

public class NestedIfPractice2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		String order = "";
		String type = "";
		String typea = "";
		String ordera = "";
		String orderb = "";

		System.out.print("Do you want to convert a (F)orce, (D)istance, or (V)olume: ");
		type = neel.nextLine();

		if(type.equals("F")){
			System.out.print("Do you want to convert from (P)ounds to Newtons or from (N)ewtons to Pounds: ");
			 order = neel.nextLine();
			 typea = "Force";
			if(order.equals("P")){
				 ordera = "Pounds";
				 orderb = "Newtons";
			}
			else{
				 ordera = "Newtons";
				 orderb = "Pounds";
			}
		}
		else if(type.equals("D")){
			System.out.print("Do you want to convert from (F)eet to Meters or from (M)eters to Feet: ");
			 order = neel.nextLine();
			 typea = "Distance";
			if(order.equals("F")){
				 ordera = "Feet";
				 orderb = "Meters";
			}
			else{
				 ordera = "Meters";
				 orderb = "Feet";
			}
		}
		else{
			System.out.print("Do you want to convert from (G)allons to Liters or from (L)iters to Gallons: ");
			 order = neel.nextLine();
			 typea = "Volume";
			if(order.equals("G")){
				 ordera = "Gallons";
				 orderb = "Liters";
			}
			else{
				 ordera = "Liters";
				 orderb = "Gallons";
			}
		}

		System.out.print("Please enter your " + typea + " in " + ordera + ": ");
		double val = neel.nextDouble();

		double vala;

		if(type.equals("F")){
			if(order.equals("P")){
				 vala = val * 4.9;
			}
			else{
				 vala = val / 4.9;
			}
		}
		else if(type.equals("D")){
			if(order.equals("F")){
				 vala = val / 3.28;
			}
			else{
				 vala = val * 3.28;
			}
		}
		else{
			if(order.equals("G")){
				 vala = val / 3.79;
			}
			else{
				 vala = val * 3.79;
			}
		}

		System.out.println();
		System.out.println("A " + typea + " of " + val + " " + ordera + " is equivalent to " + vala + " " + orderb + ".");
		System.out.println();
	}
}