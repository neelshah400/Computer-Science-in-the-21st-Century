public class RacerGame{
	public static void main(String[]args){

// Set up RacerCanvas
		RacerCanvas race = new RacerCanvas(800,800);
// Images: Tesla is red, Audi is yellow, Merces is white
		race.setFiles("tesla.jpg","audi.jpg","mercedes.jpg");

// Initialize variables
	// Wins for Tesla, Audi, and Mercedes
		int wins1 = 0;
		int wins2 = 0;
		int wins3 = 0;
	// Text output variables
		String place = "";
		String tie = "";

// Repeat 3 times
		for(int i = 1; i <= 3; i++){

// Set reset values
	// Positions for Tesla, Audi, and Mercedes
			int pos1 = 1;
			int pos2 = 1;
			int pos3 = 1;
	// Number of steps for Tesla, Audi, and Mercedes (how quickly each moves)
			int steps1 = 0;
			int steps2 = 0;
			int steps3 = 0;
	// Each car's placement for a race
			String place1 = "";
			String place2 = "";
			String place3 = "";
	// Checks for a tie
			int tieCheck = 0;

// Set random numbers for changing the x-position (1-10 pixels)
			int rand1 = (int)(Math.random()*10)+1;
			int rand2 = (int)(Math.random()*10)+1;
			int rand3 = (int)(Math.random()*10)+1;

// Hide text
			race.showText(false);

// Racers keep moving until they reach the edge of the screen
			while(pos1 < 600 || pos2 < 600 || pos3 < 600){
				if(pos1 < 600){
					race.moveRacer1(pos1,50);
					pos1 += rand1; // Changes by random amount from above
					steps1++; // Adds to counter (for determining speed)
				}
				if(pos2 < 600){
					race.moveRacer2(pos2,300);
					pos2 += rand2;
					steps2++;
				}
				if(pos3 < 600){
					race.moveRacer3(pos3,550);
					pos3 += rand3;
					steps3++;
				}
			// Delay and refresh
				race.delay(10);
				race.repaint();
			}

// Winners for each race if there are no ties
			if(steps1 != steps2 && steps2 != steps3 && steps1 != steps3){
				if(steps1 < steps2 && steps1 < steps3){
					place1 = "Tesla"; // Winner
					wins1++; // Add to number of wins
					if(steps2 < steps3){ // Figure out who is 2nd/3rd
						place2 = "Audi";
						place3 = "Mercedes";
					}
					else{
						place2 = "Mercedes";
						place3 = "Audi";
					}
				}
				else if(steps2 < steps1 && steps2 < steps3){
					place1 = "Audi";
					wins2++;
					if(steps1 < steps3){
						place2 = "Tesla";
						place3 = "Mercedes";
					}
					else{
						place2 = "Mercedes";
						place3 = "Tesla";
					}
				}
				else if(steps3 < steps1 && steps3 < steps2){
					place1 = "Mercedes";
					wins3++;
					if(steps1 < steps2){
						place2 = "Tesla";
						place3 = "Audi";
					}
					else{
						place2 = "Audi";
						place3 = "Tesla";
					}
				}
			}

// Winners for each race if there are ties
			else{
				if(steps1 == steps2 && steps1 != steps3){ // Which 2 are equal
					tieCheck = 1;
					if(steps1 < steps3){ // Tied cars won
						tie = "Tesla and Audi tie for 1st! Mercedes is in 2nd!"; // Output
					// Keep track of wins
						wins1++;
						wins2++;
					}
					else{ // Single car won
						tie = "Mercedes is in 1st! Tesla and Audi tie for 2nd!";
						wins3++; // Keep track of wins
					}
				}
				else if(steps1 == steps3 && steps1 != steps2){
					tieCheck = 1;
					if(steps1 < steps2){
						tie = "Tesla and Mercedes tie for 1st! Audi is in 2nd!";
						wins1++;
						wins3++;
					}
					else{
						tie = "Audi is in 1st! Tesla and Mercedes tie for 2nd!";
						wins2++;
					}
				}
				else if(steps2 == steps3 && steps2 != steps1){
					tieCheck = 1;
					if(steps2 < steps1){
						tie = "Audi and Mercedes tie for 1st! Tesla is in 2nd!";
						wins2++;
						wins3++;
					}
					else{
						tie = "Tesla is in 1st! Audi and Mercedes tie for 2nd!";
						wins1++;
					}
				}
				else{ // All 3 cars tie
					tieCheck = 1; // Changes what to output
					tie = "Tesla, Audi, and Mercedes tie for 1st!"; // Output
				// Keep track of wins
					wins1++;
					wins2++;
					wins3++;
				}
			}

// Display text
			if(tieCheck == 1) // Tie output
				place = tie;
			else // Normal output
				place = place1 + " is in 1st, " + place2 + " is in 2nd, and " + place3 + " is in 3rd!";
			// Set text, output, delay, and refresh
			race.setPlaces(place,0,30,25);
			race.showText(true);
			race.delay(3000);
			race.repaint();

		}

// Final standings if there are ties
		if(wins1 == wins2 || wins2 == wins3 || wins1 == wins3){
			if(wins1 == wins2 && wins2 == wins3 && wins1 == wins3) // All 3 tie
				place = "Tesla, Audi, and Mercedes tie!";
			else if(wins1 == wins2 && wins1 != wins3){ // Which 2 are tied
				if(wins1 > wins3) // Tied cars win
					place = "Tesla and Audi tie!";
				else // Single car wins
					place = "Mercedes wins!";
			}
			else if(wins1 == wins3 && wins1 != wins2){
				if(wins1 > wins2)
					place = "Tesla and Mercedes tie!";
				else
					place = "Audi wins!";
			}
			else{
				if(wins2 > wins1)
					place = "Audi and Mercedes tie!";
				else
					place = "Tesla wins!";
			}
		}

// Final standings if there are no ties
		else{
			if(wins1 > wins2 && wins1 > wins3) // Tesla wins
				place = "Tesla wins!";
			else if(wins2 > wins1 && wins2 > wins3) // Audi wins
				place = "Audi wins!";
			else if(wins3 > wins1 && wins3 > wins2) // Mercedes wins
				place = "Mercedes wins!";
		}

// Set places, output, delay, and refresh
		race.setPlaces(place,0,55,50);
		race.showText(true);
		race.delay(3000);
		race.repaint();

	}
}