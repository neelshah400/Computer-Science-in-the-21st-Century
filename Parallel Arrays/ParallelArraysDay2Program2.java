import java.util.Scanner;

public class ParallelArraysDay2Program2{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("How many names would you like to input?\t");
		int loop = neel.nextInt();
		System.out.println();

		String[] name = new String[loop];
		int[] age = new int[loop];
		int[] ft = new int[loop];
		int[] in = new int[loop];
		int[] weight = new int[loop];

		int ageSum = 0;
		int ftSum = 0;
		int inSum = 0;
		int weightSum = 0;

		for(int i = 0; i < loop; i++){
			neel.nextLine();
			System.out.print("Name:\t\t");
			name[i] = neel.nextLine();
			System.out.print("Age:\t\t");
			age[i] = neel.nextInt();
			ageSum += age[i];
			System.out.print("Height:\t(ft)\t");
			ft[i] = neel.nextInt();
			inSum += (12 * ft[i]);
			System.out.print("\t(in)\t");
			in[i] = neel.nextInt();
			inSum += in[i];
			System.out.print("Weight:\t\t");
			weight[i] = neel.nextInt();
			weightSum += weight[i];
			System.out.println();
		}

		int ageAvg = ageSum / loop;
		int weightAvg = weightSum / loop;
		int inAvg = (int)((double)inSum / (double)loop);
		int ftAvg = (inAvg / 12);
		inAvg -= (12 * ftAvg);

		System.out.println("***AVERAGES***:");
		System.out.println("Age:\t\t" + ageAvg);
		System.out.println("Height:\t(ft)\t" + ftAvg);
		System.out.println("\t(in)\t" + inAvg);
		System.out.println("Weight:\t\t" + weightAvg);
		System.out.println();

	}
}