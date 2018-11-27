import java.util.Scanner;

public class SelectionSortProgram{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Would you like to sort a list of [c]haracters or [i]ntegers?\t");
		String dataType = neel.nextLine();
		System.out.print("Would you like to in [a]scending or [d]escending order?\t\t");
		String sortType = neel.nextLine();

		if(dataType.equals("c")){
			char[] arr = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
			for(int i = 0; i < arr.length - 1; i++){
				int minIndex = i;
				int maxIndex = i;
				for(int j = i + 1; j < arr.length; j++){
					if(arr[j] < arr[minIndex])
						minIndex = j;
					if(arr[j] > arr[maxIndex])
						maxIndex = j;
				}
				char temp = arr[i];
				if(sortType.equals("a")){
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
				else if(sortType.equals("d")){
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;
				}
				else
					System.out.println("ERROR!");
			}
			for(int k = 0; k < arr.length; k++)
				System.out.print(arr[k]+" ");
		}

		else if(dataType.equals("i")){
			int[] arr = {1, 4, 7, 2, 5, 8, 3, 6, 9, 0};
			for(int i = 0; i < arr.length - 1; i++){
				int minIndex = i;
				int maxIndex = i;
				for(int j = i + 1; j < arr.length; j++){
					if(arr[j] < arr[minIndex])
						minIndex = j;
					if(arr[j] > arr[maxIndex])
						maxIndex = j;
				}
				int temp = arr[i];
				if(sortType.equals("a")){
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
				else if(sortType.equals("d")){
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;
				}
				else
					System.out.println("ERROR!");
			}
			for(int k = 0; k < arr.length; k++)
				System.out.print(arr[k]+" ");
		}

		else{
			System.out.println("ERROR!");
		}

		System.out.println("\n");

	}
}