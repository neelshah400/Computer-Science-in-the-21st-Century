import java.util.Scanner;

public class SantaNaughtyNice{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.println("Welcome to the Naughty or Nice List Generator!");
		System.out.print("How many children would you like to check? ");
		int children = neel.nextInt();
		neel.nextLine();
		System.out.println();

		String q1 = "Do they make their bed? ";
		String q2 = "Do they pick up their toys? ";
		String q3 = "Do they listen to their parents? ";
		String q4 = "Do they go to bed when told? ";
		String q5 = "Do they finish their meals? ";
		String q6 = "Are they nice to others? ";
		String q7 = "Do they complete their homework? ";
		String q8 = "Are they nice to their sibling(s)? ";
		String q9 = "Do they not whine? ";
		String q10 = "Do they help their parents? ";

		String name = "";
		int rand = 0;
		String letter = "";
		String a = "";
		String b = "";
		String c = "";
		int yes = 0;
		String response = "";

		for(int i = 1; i <= children; i++){
			System.out.print("Please enter a child's name: ");
			name = neel.nextLine();
			for(int j = 1; j >= 1; j++){
				rand = (int)(Math.random()*10)+1;
				switch(rand){
					case 1: letter = q1;
						break;
					case 2: letter = q2;
						break;
					case 3: letter = q3;
						break;
					case 4: letter = q4;
						break;
					case 5: letter = q5;
						break;
					case 6: letter = q6;
						break;
					case 7: letter = q7;
						break;
					case 8: letter = q8;
						break;
					case 9: letter = q9;
						break;
					case 10: letter = q10;
						break;
					default: System.out.println("!ERROR!");
						break;
				}
				if(!a.equals(b) && !b.equals(c) && !c.equals(a) && !a.equals("") && !b.equals("") && !c.equals(""))
					j = -1;
				else if(j == 1)
					a = letter;
				else if(j == 2)
					b = letter;
				else if(j == 3)
					c = letter;
				else if(j > 3)
					j = 0;
				else
					System.out.println("!ERROR!");
			}
			System.out.print(a);
			response = neel.nextLine();
			if(response.equals("Yes") || response.equals("yes") || response.equals("Y") || response.equals("y"))
				yes++;
			System.out.print(b);
			response = neel.nextLine();
			if(response.equals("Yes") || response.equals("yes") || response.equals("Y") || response.equals("y"))
				yes++;
			System.out.print(c);
			response = neel.nextLine();
			if(response.equals("Yes") || response.equals("yes") || response.equals("Y") || response.equals("y"))
				yes++;
			System.out.println(yes >= 2 ? name + " is on the Nice List!" : name + " is on the Naughty List!");
			System.out.println();
			a = "";
			b = "";
			c = "";
			yes  = 0;
			response = "";
		}

	}
}