public class ArraysReviewPrograms{
	public static void main(String[]args){

		//Setup
		int[] array = new int[10]; //Instructions say 30, but answer key uses 10 --> I used 10
		int i = 0;

		//1
		System.out.print("1.\t");
		for(i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*31) + 5;
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		//2
		System.out.print("2.\t");
		for(i = 0; i < array.length; i++){
			if(array[i] % 2 == 0)
				array[i] *= 3;
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		//3
		System.out.print("3.\t");
		for(i = 0; i < array.length; i++){
			if(i % 2 == 1)
				array[i] = array[i - 1];
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		//4
		System.out.print("4.\t");
		int anyMax = Integer.MIN_VALUE;
		for(i = 0; i < array.length; i++){
			if(array[i] > anyMax)
				anyMax = array[i];
		}
		System.out.println(anyMax > Integer.MIN_VALUE ? "Largest Value:\t\t" + anyMax : "Largest Value:\t\tN/A");

		//5
		System.out.print("5.\t");
		int evenMax = Integer.MIN_VALUE;
		for(i = 0; i < array.length; i++){
			if(array[i] % 2 == 0 && array[i] > evenMax)
				evenMax = array[i];
		}
		System.out.println(evenMax > Integer.MIN_VALUE ? "Largest Even Value:\t" + evenMax : "LargestEvenValue:\tN/A");

		//6
		System.out.print("6.\t");
		int evenMin = Integer.MAX_VALUE;
		for(i = 0; i < array.length; i++){
			if(array[i] % 2 == 0 && array[i] < evenMin)
				evenMin = array[i];
		}
		System.out.println(evenMin < Integer.MAX_VALUE ? "Smallest Even Value:\t" + evenMin : "Smallest Even Value:\tN/A");

		//7
		System.out.print("7.\t");
		int oddMax = Integer.MIN_VALUE;
		for(i = 0; i < array.length; i++){
			if(array[i] % 2 == 1 && array[i] > oddMax)
				oddMax = array[i];
		}
		System.out.println(oddMax > Integer.MIN_VALUE ? "Largest Odd Value:\t" + oddMax : "Largest Odd Value:\tN/A");

		//8
		System.out.print("8.\t");
		int oddMin = Integer.MAX_VALUE;
		for(i = 0; i < array.length; i++){
			if(array[i] % 2 == 1 && array[i] < evenMin)
				oddMin = array[i];
		}
		System.out.println(oddMin < Integer.MAX_VALUE ? "Smallest Odd Value:\t" + oddMin : "Smallest Odd Value:\tN/A");

		//9
		System.out.print("9.\t");
		int temp = array[0];
		for(i = 0; i < array.length; i++){
			if(i < 9)
				array[i] = array[i + 1];
			else
				array[9] = temp;
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		//10
		System.out.print("10.\t");
		for(i = 0; i < array.length; i++){
			if(i < (array.length / 2)){
				temp = array[i];
				array[i] = array[array.length - 1 - i];
				array[array.length - 1 - i] = temp;
			}
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n");

		//EC-11
		System.out.print("EC-11.\t");
		int j = 0;
		for(i = 0; i < array.length; i++){
			for(j = 0; j < array.length; j++){
				if(array[j] < array[i] && j > i){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n");
	}
}
