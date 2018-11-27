// Neel Shah (1B)

public class Neel_Shah_Strings{
	public static void main(String[]args){

		String name;

		// 1. Store and print your name backwards
		name = "Neel Shah";
		for(int i = name.length() - 1; i >= 0; i--) // for loop starts at the end of the String and goes until the beginning
			name += name.charAt(i); // charAt() method is used to add each letter to the end of the String (in reverse order - as specified by the for loop)
		name = name.substring(name.length() / 2, name.length()); // substring() method is used to change the value of the String to only the last half
		System.out.println("1.\t" + name);

		// 2. Create a method that will capitalize, store, and reuturn every other letter of your name
		name = "Neel Shah";
		name = name.toLowerCase(); // toLowerCase() method is used to make the String lowercase
		String[] a = name.split(""); // split() method is used with a blank String as the parameter to split the sentence into each of its letters (in an array)
		name = ""; // original String's value is cleared
		for(int i = 0; i < a.length; i++){ // for loop goes through every letter in the String array
			if(i % 2 == 0)
				a[i] = a[i].toUpperCase(); // every other letter is capitalized using the toUpperCase() method
		}
		for(String b : a)
			name += b; // array is converted back into a String expression
		System.out.println("2.\t" + name);

		// 3. Print out every other letter of your name starting with the first letter
		name = "Neel Shah";
		System.out.print("3.\t");
		for(int i = 0; i < name.length(); i++){ // for loop goes through every letter in the String array
			if(i % 2 == 0)
				System.out.print(name.charAt(i)); // charAt() method is used to print out every other letter
		}
		System.out.println();

		// 4. Replace and print your name name without any vowels (replace vowels with S)
		name = "Neel Shah";
		// replace() method is used 5 times to replace each vowel in the sentence with S
		// all a's are replaced with S's the first time; then all of the e's; etc.
		name = name.replace('a', 'S');
		name = name.replace('e', 'S');
		name = name.replace('i', 'S');
		name = name.replace('o', 'S');
		name = name.replace('u', 'S');
		System.out.println("4.\t" + name);

		// 5. Store and print out the last 3 letters of your name
		name = "Neel Shah";
		int b = name.length(); // length() method is used to save the original length of the String to an int
		for(int i = b - 1; i >=  b - 4; i--) // for loop goes through the last 3 letters in the String
			name += name.charAt(i); // charAt() method is used to add the last 3 letters to the end of the String
		name = name.substring(b, b + 3); // substring() method is used to set the value of the String to only the last 3 letters
		System.out.println("5.\t" + name);

		// 6. Store and print your name backwards with your name going forwards
		name = "Neel Shah";
		String[] c = name.split(" "); // split() method is used with a space as the parameter to split the sentence into each of its words (in an array)
		name = c[1] + " " + c[0]; // String's value is replaced with the last word, a space, and the first word (in that order)
		System.out.println("6.\t" + name + "\n");

	}
}