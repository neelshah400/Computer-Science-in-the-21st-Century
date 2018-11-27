public class NestedLoopsProgramming{
	public static void main(String[]args){

		int i = 0;
		int j = 0;
		int k = 0;

		//1
		System.out.println("1)\n");
		for(i = 1; i < 5; i++){
			for(j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

		//2
		System.out.println("\n2)\n");
		for(i = 1; i < 5; i++){
			for(j = 5; j > i; j--)
				System.out.print("*");
			System.out.println();
		}

		//3
		System.out.println("\n3)\n");
		for(i = 1; i < 4; i++){
			for(j = 7; j >= (i * 2); j--)
				System.out.print("*");
			System.out.println();
		}

		//4
		System.out.println("\n4)\n");
		i = 1;
		do{
			j = 0;
			while(j < i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}while(i < 5);

		//5
		System.out.println("\n5)\n");
		i = 1;
		do{
			j = 5;
			while(j > i){
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}while(i < 5);

		//6
		System.out.println("\n6)\n");
		i = 1;
		do{
			j = 3;
			while(j <= (3 * i)){
				System.out.print("***");
				j += 3;
			}
			System.out.println();
			i++;
		}while(i < 5);

		//7
		System.out.println("\n7)\n");
		for(i = 1; i < 5; i++){
			for(j = i; j > 0; j--)
				System.out.println("*");
			System.out.println("X");
		}

		//8
		System.out.println("\n8)\n");
		for(i = 1; i < 4; i++){
			k = 1;
			while(k < 6){
				System.out.print("*");
				k++;
			}
			System.out.println();
		}

		//9
		System.out.println("\n9)\n");
		for(i = 1; i < 8; i++){
			if(i < 5){
				for(j = 0; j < i; j++)
					System.out.print("*");
			}
			else{
				for(j = 0; j < (8 - i); j++)
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
}