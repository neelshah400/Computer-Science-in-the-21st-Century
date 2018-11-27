import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class FinalReviewDay2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		int response = 1;

		while(response != 0){

			System.out.print("Which program (0 to exit)?\t");
			response = neel.nextInt();
			System.out.println();

			switch(response){

				default:
					break;

				case 1:
					System.out.println("PROGRAM 1:\n");
					System.out.println(" - Statement:" + "\t\t\tHello World!\n");
					break;

				case 2:
					System.out.println("PROGRAM 2:\n");
					System.out.println("\t*****\n\t****\n\t***\n\t**\n\t*\n");
					break;

				case 3:
					System.out.println("PROGRAM 3:\n");
					for(int a = 5; a > 0; a--){
						System.out.print("\t");
						for(int b = a; b > 0; b--)
							System.out.print("*");
						System.out.println();
					}
					System.out.println();
					break;

				case 4:
					System.out.println("PROGRAM 4:\n");
					for(int c = 1; c <= 8; c++){
						System.out.print("\t");
						int d = 1;
						for(d = 0; c > d * 2; d++){
							System.out.print("*");
						}
						System.out.println(c);
					}
					System.out.println();
					break;

				case 5:
					System.out.println("PROGRAM 5:\n");
					int e = (int)(Math.random() * 8) + 56;
					System.out.println(" - Random number:" + "\t\t" + e + "\n");
					break;

				case 6:
					System.out.println("PROGRAM 6:\n");
					int[] f = new int[10];
					System.out.print(" - Array:" + "\t\t\t");
					double g = 0;
					for(int h = 0; h < f.length; h++){
						f[h] = (int)(Math.random() * 69) + 6;
						g += f[h];
						System.out.print(f[h] + " ");
					}
					g /= 10;
					System.out.println();
					System.out.println(" - Average:" + "\t\t\t" + g + "\n");
					break;

				case 7:
					System.out.println("PROGRAM 7:\n");
					System.out.print(" - Numerator:" + "\t\t\t");
					int h = neel.nextInt();
					System.out.print(" - Denominator:" + "\t\t\t");
					int i = neel.nextInt();
					System.out.print(" - Fraction:" + "\t\t\t" + Program7(h,i));
					System.out.println("\n");
					break;

				case 8:
					System.out.println("PROGRAM 8:\n");
					System.out.print(" - Enter length (in feet):" + "\t");
					double lengthInFeet = neel.nextDouble();
					System.out.print(" - Enter width (in feet):" + "\t");
					double widthInFeet = neel.nextDouble();
					double areaInSquareFeet = lengthInFeet * widthInFeet;
					areaInSquareFeet *= 100;
					areaInSquareFeet = Math.round(areaInSquareFeet);
					areaInSquareFeet /= 100;
					double areaInAcres = areaInSquareFeet / 40560.0;
					areaInAcres *= 1000;
					areaInAcres = Math.round(areaInAcres);
					areaInAcres /= 1000;
					System.out.println(" - Area measure:" + "\t\t" + areaInSquareFeet + " square feet or " + areaInAcres + " acres");
					double propertyTax = areaInAcres * 5000.0;
					propertyTax *= 100;
					propertyTax = Math.round(propertyTax);
					propertyTax /= 100;
					System.out.println(" - Property tax:" + "\t\t$" + propertyTax);
					double costPerMonth = propertyTax / 12.0;
					costPerMonth *= 100;
					costPerMonth = Math.round(costPerMonth);
					costPerMonth /= 100;
					System.out.println(" - Cost per month:" + "\t\t$" + costPerMonth + "\n");
					break;

				case 9:
					System.out.println("PROGRAM 9:\n");
					System.out.print(" - Enter a value for x:" + "\t\t");
					int x = neel.nextInt();
					System.out.print(" - Enter a value for y:" + "\t\t");
					int y = neel.nextInt();
					int[] j = swapEm(x,y);
					x = j[0];
					y = j[1];
					System.out.println(" - New value of x:" + "\t\t" + x);
					System.out.println(" - New value of y:" + "\t\t" + y + "\n");
					break;

				case 10:
					System.out.println("PROGRAM 10:\n");
					String statusA = "Continue";
					int gameA = 1;
					int rollA = 1;
					while(statusA == "Continue"){
						System.out.print(" - Game " + gameA + "\t" + "Roll " + rollA);
						System.out.print(rollA == 1 ? ": new game\t" : "\t\t\t");
						int dice1A = (int)(Math.random() * 6) + 1;
						int dice2A = (int)(Math.random() * 6) + 1;
						int sumA = dice1A + dice2A;
						System.out.print("Player rolls a sum of " + sumA + "\t");
						System.out.print(sumA < 10 ? "\t" : "");
						if(sumA == 7 || sumA == 11)
							statusA = "Player wins";
						else if(sumA == 2 || sumA == 3 || sumA == 12)
							statusA = "Player loses";
						else
							statusA = "Continue";
						System.out.println(statusA);
						rollA++;
					}
					System.out.println();
					break;
				
				case 11:
					System.out.println("PROGRAM 11:\n");
					int wins = 0;
					int losses = 0;	
					int gameB = 1; 
					while(gameB <= 10000){
						int rollB = 1;
						String statusB = "Continue";
						while(statusB == "Continue"){
							System.out.print(" - Game " + gameB + "\t" + "Roll " + rollB);
							System.out.print(rollB == 1 ? ": new game\t" : "\t\t\t");
							int dice1B = (int)(Math.random() * 6) + 1;
							int dice2B = (int)(Math.random() * 6) + 1;
							int sumB = dice1B + dice2B;
							System.out.print("Player rolls a sum of " + sumB + "\t");
							System.out.print(sumB < 10 ? "\t" : "");
							if(sumB == 7 || sumB == 11){
								statusB = "Player wins";
								wins++;
							}
							else if(sumB == 2 || sumB == 3 || sumB == 12){
								statusB = "Player loses";
								losses++;
							}
							else
								statusB = "Continue";
							System.out.println(statusB);
							rollB++;
						}
						System.out.println();
						gameB++;
					}
					System.out.println(" - Wins:" + "\t\t\t" + wins);
					System.out.println(" - Losses:" + "\t\t\t" + losses);
					double winProb = (wins * 1.0) / ((wins * 1.0) + (losses * 1.0));
					winProb *= 10000;
					winProb = Math.round(winProb);
					winProb /= 100;
					System.out.println(" - Probability of winning:" + "\t" + winProb + "%\n");
					break;

			}
		}

	}

	public static String Program7(int n, int d){
		int max = 0;
		if(n > d)
			max = n;
		else
			max = d;
		if(max >= 1){
			for(int i = 1; i <= max; i++){
				if(n % i == 0 && d % i == 0){
					n /= i;
					d /= i;
				}
			}
		}
		String fraction = n + "/" + d;
		return fraction;
	}

	public static int[] swapEm(int a, int b){
		int[] arr = {b,a};
		return arr;
	}

}