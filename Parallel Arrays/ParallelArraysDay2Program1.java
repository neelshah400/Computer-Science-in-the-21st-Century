import java.util.Scanner;

public class ParallelArraysDay2Program1{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);

		String[] name = {"Clayton Kershaw", "Jake Arrieta", "David Price", "Max Scherzer", "Chris Sale", "Dallas Keuchel", "Zack Greinke", "Corey Kluber", "Gerrit Cole"};
		String[] team = {"Dodgers", "Cubs", "Red Sox", "Nationals", "White Sox", "Astros", "Dodgers", "Indians", "Pirates"};
		int[] wins = {16, 22, 18, 14, 13, 20, 19, 9, 19};
		int[] losses = {7, 6, 5, 12, 11, 8, 3, 16, 8};
		int[] games = {33, 33, 32, 33, 31, 33, 32, 32, 32};
		double[] ip = {232.2, 229, 220.1, 228.2, 208.2, 232, 222.2, 222, 208};
		double[] k9 = {11.64, 9.28, 9.19, 10.86, 11.82, 8.38, 8.08, 9.93, 8.74};
		double[] bb9 = {1.62, 1.89, 1.92, 1.34, 1.81, 1.98, 1.62, 1.82, 1.9};
		double[] era = {2.13, 1.77, 2.45, 2.79, 3.41, 2.48, 1.66, 3.49, 2.6};

		String player = "";
		int index = -1;
		String stat = "";
		String statement = "";
		boolean redo = false;
		boolean quit = false;

		while(quit == false){

			player = "";
			index = -1;
			stat = "";
			statement = "";
			redo = false;

			do{
				System.out.print("Which player would you like to research?\t");
				player = neel.nextLine();
				for(int i = 0; i < name.length; i++){
					if(name[i].equals(player)){
						index = i;
						redo = false;
					}
				}
				if(player.equals("Quit")){
					quit = true;
					redo = false;
				}
				else{
					if(index == -1){
						redo = true;
						System.out.println("Error: invalid player!");
					}
				}
			}while(redo == true);

			if(quit == false){
				do{
					System.out.print("Which stat would you like to research?\t\t");
					stat = neel.nextLine();
					switch(stat){
						case "Team":
							redo = false;
							statement = name[index] + " played for the " + team[index] + " last season.";
							break;
						case "Wins":
							redo = false;
							statement = name[index] + " had " + wins[index] + " wins last seasons.";
							break;
						case "Losses":
							redo = false;
							statement = name[index] + " had " + losses[index] + " losses last seasons.";
							break;
						case "Games":
							redo = false;
							statement = name[index] + " played in " + games[index] + " games last season.";
							break;
						case "IP":
							redo = false;
							statement = name[index] + " pitched " + ip[index] + " innings last season.";
							break;
						case "K/9":
							redo = false;
							statement = name[index] + " striked out " + k9[index] + " batters for every 9 innings he pitched.";
							break;
						case "BB/9":
							redo = false;
							statement = name[index] + " walked " + bb9[index] + " batters for every 9 innings he pitched.";
							break;
						case "ERA":
							redo = false;
							statement = name[index] + " gave up " + era[index] + " runs for every 9 innings he pitched.";
							break;
						default:
							redo = true;
							System.out.println("Error: invalid stat!");
							break;
					}
				}while(redo == true);

				System.out.println(statement + "\n");
			}
		}

	}
}