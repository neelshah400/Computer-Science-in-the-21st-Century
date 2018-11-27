import java.util.Scanner;

public class NestedIfPractice1{
	public static void main(String[]args){

		Scanner Neel = new Scanner(System.in);

		System.out.print("Please enter angle 1: ");
		int ang1 = Neel.nextInt();
		System.out.print("Please enter angle 2: ");
		int ang2 = Neel.nextInt();
		System.out.print("Please enter angle 3: ");
		int ang3 = Neel.nextInt();
		System.out.print("Please enter angle 4: ");
		int ang4 = Neel.nextInt();

		System.out.println();

		if(ang1 + ang2 + ang3 + ang4 == 360){
			if(ang1 == ang3){
				if(ang2 == ang4){
					if(ang1 == ang2){
						if(ang2 == ang3){
							if(ang3 == ang4){
								if(ang4 == 90){
									System.out.println("The figure is a rectangle.");
								}
							}
						}
					}
					else{
						System.out.println("The figure is a parallelogram.");
					}
				}
				else{
					System.out.println("The figure is a quadrilateral with no special qualities.");
				}
			}
			else{
				System.out.println("The figure is a quadrilateral with no special qualities.");
			}
		}
		else{
			System.out.println("The figure is not a quadrilateral.");
		}

	System.out.println();

	}
}