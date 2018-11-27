public class RandomNumbers{
	public static void main(String[]args){

		double rando = Math.random()*10;//normaly 0 to 1 BUT changed to 1 to 10
		System.out.println(rando);

		int rando2 = (int)(Math.random()*10)+1;//1 is starting number AND 10 is range
		System.out.println(rando2);

		//to find last number: ***(range + start)-1***

	}
}