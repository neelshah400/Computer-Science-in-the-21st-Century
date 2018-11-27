public class StringsCodingTasks{
	public static void main(String[]args){

		String a;

		// 1. Output the String backwards
		a = "The five boxing wizards jump quickly";
		System.out.print("1.\t");
		for(int i = a.length() - 1; i >= 0; i--) // for loop starts at the the end of the String and goes until the beginning
			System.out.print(a.charAt(i)); // charAt() method is used to print each letter (in reverse order - as specified by the for loop)
		System.out.println();

		// 2. Reverse the order of the String
		a = "The five boxing wizards jump quickly";
		System.out.print("2.\t");
		for(int i = a.length() - 1; i >= 0; i--) // for loop starts at the the end of the String and goes until the beginning
			a += a.charAt(i); // charAt() method is used to add each letter to the end of the String (in reverse order - as specified by the for loop)
		a = a.substring(a.length() / 2, a.length()); // substring() method is used to change the value of the String to only the last half
		System.out.println(a);

		// 3. Capitalize all the letters in the sentence
		a = "The five boxing wizards jump quickly";
		System.out.print("3.\t");
		a = a.toUpperCase(); // toUpperCase() method is used to make the String all uppercase
		System.out.println(a);

		// 4. Replace all vowels with the letter W
		a = "The five boxing wizards jump quickly";
		System.out.print("4.\t");
		// replace() method is used 5 times to replace each vowel in the sentence with W
		// all a's are replaced with W's the first time; then all of the e's; etc.
		a = a.replace('a', 'W');
		a = a.replace('e', 'W');
		a = a.replace('i', 'W');
		a = a.replace('o', 'W');
		a = a.replace('u', 'W');
		System.out.println(a);

		// 5. Remove every other character in the sentence
		a = "The five boxing wizards jump quickly";
		System.out.print("5.\t");
		String[] b = a.split(""); // split() method is used with a blank String as the parameter to split the sentence into each of its letters (in an array)
		a = ""; // original String's value is cleared
		for(int i = 0; i < b.length; i++){ // for loop goes through every letter in the String array
			if(i % 2 == 1)
				b[i] = ""; // every other letter is removed
		}
		for(String c : b){
			a += c; // array is converted back into a String expression
		}
		System.out.println(a);

		// 6. Determine the number of words that exist in a sentence
		a = "The five boxing wizards jump quickly";
		System.out.print("6.\t");
		String[] d = a.split(" "); // split() method is used with a space as the parameter to split the sentence into each of its words (in an array)
		System.out.println(d.length + " words"); // the length of the array (which is also the length of the sentence) is printed

		// 7. Determine the average length of the words in a sentence
		a = "The five boxing wizards jump quickly";
		System.out.print("7.\t");
		String[] e = a.split(" "); // split() method is used with a space as the parameter to split the sentence into each of its words (in an array)
		double f = 0; // variable used to keep track of the total number of letters in the sentence
		for(int i = 0; i < e.length; i++){ // for loop goes through each word in the sentence
			f += e[i].length(); // the length of each word is added to the total
		}
		f /= (double) e.length; // total is divided by the number of words to get the average length
		f = Math.round(f * 100.0) / 100.0; // Math.round() is used to round the average to the nearest hundredth
		System.out.println(f + " letters per word");


		// 8. Store each word in an array of String; write the sentence backwards
		a = "The five boxing wizards jump quickly";
		System.out.print("8.\t");
		String[] g = a.split(" "); // split() method is used with a space as the parameter to split the sentence into each of its words (in an array)
		a = ""; // original String's value is cleared
		for(int i = g.length - 1; i >= 0; i--) // for loop goes through each word in the sentence backwards (starting from the last word and ending on the first word)
			a += g[i] + " "; // each word is added to the value of the String (along with a space to separate words)
		System.out.println(a + "\n");

	}
}