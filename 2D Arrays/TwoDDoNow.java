public class TwoDDoNow{
	public static void main(String[]args){

		//1
		System.out.println("//1\n");
		int i = 0;
		int j = 0;
		int[] factors = new int[99];
		int max = 0;
		int num = 0;
		for(i = 0; i < factors.length; i++){
			for(j = 0; j <= i; j++){
				if((i + 1) % (j + 1) == 0)
					factors[i]++;
			}
			if(factors[i] > max){
				max = factors[i];
				num = (i + 1);
			}
		}
		System.out.println(num + "\n");

		//2
		System.out.println("//2\n");
		int[] array = new int[20];
		for(i = 0; i < array.length; i++){
			array[i] = i + 1;
			System.out.print(array[i] + "\t");
			if((i + 1) % 5 == 0)
				System.out.println();
		}
		System.out.println();

	}
}