import java.util.Scanner;

public class HangmanProject{

	public static void main(String[]args){

		Scanner neel = new Scanner(System.in); // Initialize Scanner
		showInstructions(); // Call showInstructions() method

		int gameScore = 0; // Total score
		int gameNumber = 0; // Counter for number of games
		char userResponse = 'y'; // Checks whether or not the user wants to play again
		char difLevel = ' '; // Keeps track of difficulty level
		playGame(gameScore, gameNumber, userResponse, difLevel, neel); // Call playGame() method, with the game score, game number, user response, difficulty level, and Scanner as parameters
		System.out.println();

	}

	public static void showInstructions(){ // showInstructions() method used to tell the user how to play the game and use my program

		System.out.println("HANGMAN (by: Neel Shah)");
		System.out.println();

		// Tells user how to play a generic game of Hangman
		System.out.println("Overview:");
		System.out.println();
		System.out.println(" - Hangman is a game in which the objective is to guess a certain word by picking letters every turn.");
		System.out.println(" - If that letter is located anywhere in the word, it is filled in (replacing a dash).");
		System.out.println(" - If that letter is not in the word, you get a 'miss' in the game (represented by a body part on the drawing).");
		System.out.println(" - When you have 6 misses, the drawing represents a hanging man, so you lose.");
		System.out.println();

		// Tells user how to use this program
		System.out.println("How to play this computer version:");
		System.out.println();
		System.out.println(" - First, the computer will ask you to choose a difficulty level [e/m/h], which corresponds to word length.");
		System.out.println(" - On each turn, your current guess, remaining misses, and previously guessed letters are displayed.");
		System.out.println(" - Additionally, an ASCII art drawing will be displayed above this information.");
		System.out.println(" - Then, you will be prompted to pick a letter, and will be told whether the letter is correct or incorrect.");
		System.out.println(" - If you guess the entire word correctly, you win.");
		System.out.println(" - If you still don't have the correct word after 6 guesses, you lose.");
		System.out.println();

		// Tells user how each game is scored
		System.out.println("Scoring:");
		System.out.println();
		System.out.println(" - If you win a round, you get [e] +1, [m] +2, or [h] +3 points.");
		System.out.println(" - After the round, you will be asked whether or not you want to play again [y/n].");
		System.out.println();

	}

	public static void playGame(int score, int game, char response, char level, Scanner reader){ // playGame() method used to let the user play one game of Hangman

		game++; // Each time a game is played, the variable is increased by 1

		/*	Word created using the generateWord() method
			generateWord() uses difficultyChooser() as a parameter
			difficultyChooser() uses level and reader as parameters, to prompt the user for input */
		String word = generateWord(difficultyChooser(level, reader));

		System.out.println("Game " + game + ":");

		/*	Word is divided into an array for each letter using the split() method
			This is going to be used to expand the word, with a space between each letter */
		String[] wordArray = word.split("");
		String newWord = "";
		for(int i = 0; i < wordArray.length; i++){
			newWord += wordArray[i] + " ";
		}

		int misses = 6; // Keeps track of incorrect attempts
		String guessedLetters = ""; // Keeps track of previously guessed letters
		String currentGuess = ""; // Keeps track of the user's current guess

		for(int i = 0; i < word.length(); i++){
			currentGuess += "_ "; // Dashes used to represent blanks in the current guess
		}

		// While loop lets the user keep picking letters as long as they have more than 0 misses remaining
		while(misses > 0){
			drawHangman(misses); // drawHangman() method used to create an ASCII art image based on the number of misses remaining

			// Print current guess, number of misses left, and previously guessed letters
			System.out.println("\n - Current guess:\t\t" + currentGuess);
			System.out.println(" - Misses left:\t\t\t" + misses);
			System.out.println(" - Previously guessed:\t\t" + guessedLetters);

			// Let the user pick a letter, and record their input using a char Scanner
			System.out.print(" - Pick a letter:\t\t");
			char guess = reader.next().toLowerCase().charAt(0);

			int locationInGuess = guessedLetters.indexOf(guess); // Checks where the guess is located in the String of previously guessed letters
			int locationInWord = newWord.indexOf(guess); // Checks where the guess is located in the expanded word (with spaces between the letters)

			// If the guess is located in the String of previously guessed letters, make the user pick again
			if(locationInGuess != -1){
				System.out.println("\n - Already guessed " + guess + ". Try again!");
			}

			// Otherwise, figure out whether or not their guess is correct
			else{

				// If the guess is not located in the word ...
				if(locationInWord == -1){
					System.out.println("\n - No " + guess + "!"); // Tell the user
					misses--; // Take away a miss
					guessedLetters += guess + " "; // Add guess to String of previously guessed letters
				}

				// If the guess is located in the word ...
				else{
					System.out.println("\n - Found " + guess + "!"); // Tell the user
					guessedLetters += guess + " "; // Add guess to String of previously guessed letters

					// Split the current guess into an array
					String[] splitGuess = currentGuess.split("");

					// For loop starts at 0 and goes up to the length of the array
					for(int i = 0; i < newWord.length(); i++){
						locationInWord = newWord.substring(i).indexOf(guess) + i; // Finds the first instance of guess in the word, using a substring starting at the iteration of the for loop

						// If the character at the location of guess is equal to guess (so, if the substring contains guess) ...
						if(newWord.charAt(locationInWord) == guess){
							splitGuess[locationInWord] = newWord.charAt(locationInWord) + ""; // Set the array at the index of the guess equal to the char at the index of guess in the word
							currentGuess = ""; // Clear the current guess

							// Combine all the elements of the array into String currentGuess
							for(int j = 0; j < splitGuess.length; j++){
								currentGuess += splitGuess[j];
							}
						}
					}
				}
			}

			// Check if the user won
			if(newWord.equals(currentGuess)){

				String[] listE = {"dog", "ghost", "cow", "bug", "snake", "socks", "coat", "heart", "kite", "milk"};
				String[] listM = {"baseball", "dominoes", "hockey", "treasure", "pirate", "whistle", "airplane", "battery", "password", "computer"};
				String[] listH = {"newsletter", "neighborhood", "commercial", "landscape", "pharmacist", "dashboard", "important", "professor", "chestnut", "bookstore"};

				for(int i = 0; i < 10; i++){
					if(listE[i] == word){
						level = 'e';
					}
					if(listM[i] == word){
						level = 'm';
					}
					if(listH[i] == word){
						level = 'h';
					}
				}
				if(level == 'e'){ // If they chose easy mode, give them 1 point
					score++;
				}
				if(level == 'm'){ // If they chose medium mode, give them 2 points
					score += 2;
				}
				if (level == 'h'){ // If they chose hard mode, give them 3 points
					score += 3;
				}

				// Tell the user they won, tell them the word, and tell them their total score
				System.out.println();
				System.out.println(" - You win!");
				System.out.println(" - The word was:\t\t" + word);
				System.out.println(" - Total score:\t\t\t" + score);
				System.out.println();

				// Ask the user whether or not they want to play again, and use a char Scanner to get their response
				System.out.print("Play again [y/n]?\t\t");
				response = reader.next().toLowerCase().charAt(0);

				// If they say yes, call the playGame() method again
				if(response == 'y'){
					playGame(score, game, response, level, reader);
				}
				// If they don't say yes, exit the loop
				else{
					break;
				}
			}
		}

		// Check if the user lost
		if(misses < 1){

			// Tell the user they lost, tell them the word, and tell them their total score
			System.out.println();
			System.out.println(" - You lose!");
			System.out.println(" - The word was:\t\t" + word);
			System.out.println(" - Total score:\t\t\t" + score);
			System.out.println();

			// Ask the user whether or not they want to play again, and use a char Scanner to get their response
			System.out.print("Play again [y/n]?\t\t");
			response = reader.next().toLowerCase().charAt(0);

			// If they say yes, call the playGame() method again
			if(response == 'y'){
				playGame(score, game, response, level, reader);
			}
		}
	}

	public static String[] difficultyChooser(char level, Scanner reader){ // difficultyChooser() method used to let the user choose a difficulty level

		// Char scanner used to record the user's choice
		System.out.print("Difficulty level [e/m/h]:\t");
		level = reader.next().toLowerCase().charAt(0);
		System.out.println();

		// To change difficulty level, different word lengths are used in different arrays
		String[] listE = {"dog", "ghost", "cow", "bug", "snake", "socks", "coat", "heart", "kite", "milk"};
		String[] listM = {"baseball", "dominoes", "hockey", "treasure", "pirate", "whistle", "airplane", "battery", "password", "computer"};
		String[] listH = {"newsletter", "neighborhood", "commercial", "landscape", "pharmacist", "dashboard", "important", "professor", "chestnut", "bookstore"};

		// Return array corresponding to chosen difficulty level
		switch(level){
			case 'e':
				return listE;
			case 'm':
				return listM;
			case 'h':
				return listH;
			default: // If input was invalid, run method again
				difficultyChooser(level, reader);
				break;
		}
		return listE; // Return method needed outside switch to prevent Java error (will not be used)

	}

	public static String generateWord(String[] list){ // generateWord() method picks a word from the correct array

		int index = (int)(Math.random() * list.length); // Random number generated within boundary of array length
		String word = list[index]; // Word set equal to the array elemrnt at the index generated
		return word; // Word is returned

	}

	public static void drawHangman(int misses){ // drawHangman() method used to create an ASCII art hangman image

		// Characters in the image will be stored in a 10 x 20 array, preflled with spaces
		String[][] x = new String[10][20];
		for(int row = 0; row < x.length; row++){
			for(int col = 0; col < x[row].length; col++){
				x[row][col] = " ";
			}
		}

		// If the user has less than or equal to 6 misses, draw the base
		if(misses <= 6){
			for(int row = 0; row < x.length; row++)
				x[row][4] = "|";
			for(int col = 0; col < 9; col++)
				x[9][col] = "_";
			x[9][4] = "|";
			x[0][4] = " ";
			for(int col = 4; col < 16; col++)
				x[0][col] = "_";
			x[1][15] = "|";
		}

		// If the user has less than or equal to 5 misses, draw the head
		if(misses <= 5){
			x[1][14] = "_";
			x[1][16] = "_";
			x[2][13] = "/";
			x[2][17] = "\\";
			x[3][13] = "\\";
			x[3][17] = "/";
			for(int col = 14; col < 17; col++)
				x[4][col] = "`";
		}

		// If the user has less than or equal to 4 misses, draw the body
		if(misses <= 4){
			x[4][15] = "|";
			x[5][15] = "|";
			x[6][15] = "|";
		}

		// If the user has less than or equal to 3 misses, draw the left leg
		if(misses <= 3){
			x[7][14] = "/";
			x[8][13] = "/";
		}

		// If the user has less than or equal to 2 misses, draw the right leg
		if(misses <= 2){
			x[7][16] = "\\";
			x[8][17] = "\\";
		}

		// If the user has less than or equal to 1 miss, draw the left arm
		if(misses <= 1){
			x[5][14] = "_";
			x[5][13] = "\\";
		}

		// If the user has less than or equal to 0 misses, draw the right arm
		if(misses <= 0){
			x[5][16] = "_";
			x[5][17] = "/";
		}

		// Print out the array by using for loops for the rows and collums
		for(int row = 0; row < x.length; row++){
			for(int col = 0; col < x[row].length; col++){
				System.out.print(x[row][col]);
			}
			System.out.println();
		}

	}

}