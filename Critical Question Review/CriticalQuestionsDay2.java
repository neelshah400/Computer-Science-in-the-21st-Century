public class CriticalQuestionsDay2{
	public static void main(String[]args){

		//Program 1
		int[] array = new int[8];
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 19) + 1;
			if(array[i] < min)
				min = array[i];
			sum += array[i];
		}
		System.out.println("1.\tMinimum Value = " + min + "\tSum = " + sum);

		//Program 2
		int num = 0;
		System.out.print("2.\t");
		for(num = 123; num <= 456; num++){
			if(num % 3 == 0){
				if(num % 5 == 0){
					System.out.print(num + "  ");
				}
			}
		}
		System.out.println();

		//Program 3
		String a = "First";
		String b = "Second";
		String temp = a;
		a = b;
		b = temp;
		System.out.println("3.\ta = " + a + "\tb = " + b + "\n");

	}
}