import java.util.Scanner;

public class StringsTest{

	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		System.out.print("Enter a two-word String: ");
		String input = neel.nextLine();

		String word1 = input.substring(0,input.indexOf(" "));
		String word2 = input.substring(input.indexOf(" ") + 1);

		System.out.println(change(word1,word2));
		System.out.println();

	}

	public static String change(String a, String b){

		int min = 0;
		String after = "";
		String output = "";

		if(a.length() == b.length()){
			min = a.length();
			after = "c";
		}
		else if(a.length() < b.length()){
			min = a.length();
			after = "b";
		}
		else{
			min = b.length();
			after = "a";
		}

		for(int i = 0; i < min; i++){
			output += a.charAt(i);
			output += b.charAt(i);
		}

		if(after.equals("c"))
			output += "";
		else if(after.equals("a"))
			output += a.substring(min);
		else
			output += b.substring(min);

		return output;

	}

}