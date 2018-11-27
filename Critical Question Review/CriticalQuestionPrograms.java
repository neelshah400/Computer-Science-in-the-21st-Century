public class CriticalQuestionPrograms{
	public static void main(String[]args){

		//Program 1
		int[] array = new int[10];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*8) + 3;
			if(array[i] > max)
				max = array[i];
		}
		System.out.println("1.\tMaximum Value:\t" + max);

		//Program 2
		System.out.print("2.\tNumbers:\t");
		for(int num = 300; num <= 500; num++){
			if(num % 2 == 0){
				if(num % 11 == 0){
					System.out.print(num + "\t");
				}
			}
		}
		System.out.println();

		//Program 3
		System.out.print("3.\tVariables:\t");
		int a = 3;
		int b = 5;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + "\tb = " + b + "\n");

	}
}