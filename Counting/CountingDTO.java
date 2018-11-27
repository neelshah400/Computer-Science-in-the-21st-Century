public class CountingDTO{
	public static void main(String[]args){
		int a = 4;
		int b = 5;
		int c = 6;
		a ++;
		b = c - a;
		c *= c;
		b %= 2;
		c -=a;
		System.out.println(a+"\t"+b+"\t"+c);

	}
}