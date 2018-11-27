import java.util.Scanner;

public class ShahTTT{
	public static void main(String[]args){

		Scanner neel = new Scanner(System.in);
		TicTacToeBoard board = new TicTacToeBoard(620,720);
		int[][]boardLine = {{0,200,600,200},{0,400,600,400},{200,0,200,600},{400,0,400,600}};
		board.defineBoard(boardLine);

		char[][] arr = new char[3][3];
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++)
				arr[row][col] = '-';
		}

		board.setBoard(arr);
		board.setFiles("x.png","o.png");
		board.repaint();

		System.out.println("TIC-TAC-TOE GAME\tBy: Neel Shah\n");
		System.out.println("Instructions:");
		System.out.println("\t\t\t\t\t\t\t\t\t\t 1 | 2 | 3 ");
		System.out.println("Player 1 will be X and Player 2 will be O.\t\t\t\t\t-----------");
		System.out.println("To select a position, type a number from 1-9 (as shown to the right).\t\t 4 | 5 | 6 ");
		System.out.println("First player to get 3 in a row wins.\t\t\t\t\t\t-----------");
		System.out.println("\t\t\t\t\t\t\t\t\t\t 7 | 8 | 9");
		System.out.println("Game Modes:\n");
		System.out.println("[1] Single Player - You vs. Computer");
		System.out.println("[2] Double Player - Player 1 vs. Player 2");
		System.out.println("[3] Smart - You vs. Computer\t\t\t***FOR FUN***");
		System.out.println("[4] Automatic Loop - Computer 1 vs. Computer 2\t***FOR FUN***\n");

		int game = 0;
		boolean error = false;
		do{
			if(error == false)
				System.out.print("Please select a game mode [1, 2, 3, or 4]:\t\t\t");
			else
				System.out.print("Please select one of the given options [1, 2, 3, or 4]:\t\t");
			game = neel.nextInt();
			if(game == 1 || game == 2 || game == 3 || game == 4)
				error = false;
			else
				error = true;
		} while(error == true);

		System.out.println();

		boolean p1 = true;
		boolean redo = false;
		int win = 0;
		boolean done = false;
		int filled = 0;
		int position = 0;
		int y = 0;
		int x = 0;
		board.showText(false);

		int r0 = 0;
		int r1 = 0;
		int r2 = 0;
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int d0 = 0;
		int d1 = 0;

		int max = 0;
		int eval = 0;

		int textX = 10;
		int textY = 665;
		int textSize = 65;

		char[] sel = new char[9];
		for(int row = 0; row < sel.length; row++){
			sel[row] = 'n';
		}

		while(game == 1  && done == false){
			if(p1 == true){
				if(redo == false)
					System.out.print("X - Your turn! Select a position [number from 1-9]:\t\t");
				else
					System.out.print("X - Position not valid! Try again [number from 1-9]:\t\t");
				position = neel.nextInt();
				if(position < 1 || position > 9){
					p1 = true;
					redo = true;
				}
				else{
					y = yselector(position);
					x = xselector(position);
					if(arr[y][x] == '-'){
						arr[y][x] = 'x';
						p1 = false;
						redo = false;
					}
					else{
						p1 = true;
						redo = true;
					}
				}
			}
			else{
				position = (int)(Math.random() * 9) + 1;
				y = yselector(position);
				x = xselector(position);
				if(position < 1 || position > 9){
					p1 = false;
					redo = true;
				}
				else{
					if(arr[y][x] == '-'){
						arr[y][x] = 'o';
						System.out.println("O - Computer selected position:\t\t\t\t\t" + position);
						p1 = true;
						redo = false;
					}
					else{
						p1 = false;
						redo = true;
					}
				}
			}
			board.repaint();

			for(int j = 0; j < arr.length; j++){
				if(arr[j][0] == arr[j][1] && arr[j][1] == arr[j][2]){
					if(arr[j][0] == 'x')
						win = 1;
					if(arr[j][0] == 'o')
						win = 2;
				}
			}
			for(int k = 0; k < arr.length; k++){
				if(arr[0][k] == arr[1][k] && arr[1][k] == arr[2][k]){
					if(arr[0][k] == 'x')
						win = 1;
					if(arr[0][k] == 'o')
						win = 2;
				}
			}
			if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
				if(arr[0][0] == 'x')
					win = 1;
				if(arr[0][0] == 'o')
					win = 2;
			}
			if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]){
				if(arr[0][2] == 'x')
					win = 1;
				if(arr[0][2] == 'o')
					win = 2;
			}

			if(win == 1){
				done = true;
				System.out.println("\nX - You Win!\n");
				board.setWinner("X - You Win!", textX, textY, textSize);
				board.showText(true);
			}
			if(win == 2){
				done = true;
				System.out.println("\nO - Computer Wins!\n");
				board.setWinner("O - Computer Wins!",textX, textY, textSize);
				board.showText(true);
			}
			for(int row = 0; row < arr.length; row++){
				for(int col = 0; col < arr[row].length; col++){
					if(arr[row][col] != '-' && win == 0){
						filled++;
					}
				}
			}
			if(filled == 9 && win == 0){
				done = true;
				System.out.println("\nTie!\n");
				board.setWinner("Tie!", textX, textY, textSize);
				board.showText(true);
			}
			else
				filled = 0;
		}

		while(game == 2 && done == false){
			if(p1 == true){
				if(redo == false)
					System.out.print("X - Player 1's turn! Select a position [number from 1-9]:\t");
				else
					System.out.print("X - Position not valid! Try again [number from 1-9]:\t\t");
				position = neel.nextInt();
				if(position < 1 || position > 9){
					p1 = true;
					redo = true;
				}
				else{
					y = yselector(position);
					x = xselector(position);
					if(arr[y][x] == '-'){
						arr[y][x] = 'x';
						p1 = false;
						redo = false;
					}
					else{
						p1 = true;
						redo = true;
					}
				}
			}
			else{
				if(redo == false)
					System.out.print("O - Player 2's turn! Select a position [number from 1-9]:\t");
				else
					System.out.print("O - Position not valid! Try again [number from 1-9]:\t\t");
				position = neel.nextInt();
				if(position < 1 || position > 9){
					p1 = false;
					redo = true;
				}
				else{
					y = yselector(position);
					x = xselector(position);
					if(arr[y][x] == '-'){
						arr[y][x] = 'o';
						p1 = true;
						redo = false;
					}
					else{
						p1 = false;
						redo = true;
					}
				}
			}
			board.repaint();

			for(int j = 0; j < arr.length; j++){
				if(arr[j][0] == arr[j][1] && arr[j][1] == arr[j][2]){
					if(arr[j][0] == 'x')
						win = 1;
					if(arr[j][0] == 'o')
						win = 2;
				}
			}
			for(int k = 0; k < arr.length; k++){
				if(arr[0][k] == arr[1][k] && arr[1][k] == arr[2][k]){
					if(arr[0][k] == 'x')
						win = 1;
					if(arr[0][k] == 'o')
						win = 2;
				}
			}
			if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
				if(arr[0][0] == 'x')
					win = 1;
				if(arr[0][0] == 'o')
					win = 2;
			}
			if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]){
				if(arr[0][2] == 'x')
					win = 1;
				if(arr[0][2] == 'o')
					win = 2;
			}

			if(win == 1){
				done = true;
				System.out.println("\nX - Player 1 Wins!\n");
				board.setWinner("X - Player 1 Wins!", textX, textY, textSize);
				board.showText(true);
			}
			if(win == 2){
				done = true;
				System.out.println("\nO - Player 2 Wins!\n");
				board.setWinner("O - Player 2 Wins!", textX, textY, textSize);
				board.showText(true);
			}
			for(int row = 0; row < arr.length; row++){
				for(int col = 0; col < arr[row].length; col++){
					if(arr[row][col] != '-' && win == 0){
						filled++;
					}
				}
			}
			if(filled == 9 && win == 0){
				done = true;
				System.out.println("\nTie!\n");
				board.setWinner("Tie!", textX, textY, textSize);
				board.showText(true);
			}
			else
				filled = 0;
		}

		while(game == 3  && done == false){
			if(p1 == true){
				if(redo == false)
					System.out.print("X - Your turn! Select a position [number from 1-9]:\t\t");
				else
					System.out.print("X - Position not valid! Try again [number from 1-9]:\t\t");
				position = neel.nextInt();
				if(position < 1 || position > 9){
					p1 = true;
					redo = true;
				}
				else{
					y = yselector(position);
					x = xselector(position);
					if(arr[y][x] == '-'){
						arr[y][x] = 'x';
						p1 = false;
						redo = false;
					}
					else{
						p1 = true;
						redo = true;
					}
				}
			}
			else{
				r0 = 0;
				r1 = 0;
				r2 = 0;
				c0 = 0;
				c1 = 0;
				c2 = 0;
				d0 = 0;
				d1 = 0;
				max = 0;
				eval = 0;

				for(int row = 0; row < sel.length; row++){
					sel[row] = 'n';
				}

				for(int row = 0; row < arr.length; row++){
					for(int col = 0; col < arr[row].length; col++){
						if(row == 0 && arr[row][col] == 'x')
							r0++;
						if(row == 1 && arr[row][col] == 'x')
							r1++;
						if(row == 2 && arr[row][col] == 'x')
							r2++;
						if(col == 0 && arr[row][col] == 'x')
							c0++;
						if(col == 1 && arr[row][col] == 'x')
							c1++;
						if(col == 2 && arr[row][col] == 'x')
							c2++;
						if(row == col && arr[row][col] == 'x')
							d0++;
						if(((row == 0 && col == 2) || (row == 1 && col == 1) || (row == 2 && col == 0)) && arr[row][col] == 'x')
							d1++;
					}
				}

				if(r0 > max)
					max = r0;
				if(r1 > max)
					max = r1;
				if(r2 > max)
					max = r2;
				if(c0 > max)
					max = c0;
				if(c1 > max)
					max = c1;
				if(c2 > max)
					max = c2;
				if(d0 > max)
					max = d0;
				if(d1 > max)
					max = d1;

				if(max == r0){
					sel[0] = 'y';
					sel[1] = 'y';
					sel[2] = 'y';
				}
				if(max == r1){
					sel[3] = 'y';
					sel[4] = 'y';
					sel[5] = 'y';
				}
				if(max == r2){
					sel[6] = 'y';
					sel[7] = 'y';
					sel[8] = 'y';
				}
				if(max == c0){
					sel[0] = 'y';
					sel[3] = 'y';
					sel[6] = 'y';
				}
				if(max == c1){
					sel[1] = 'y';
					sel[4] = 'y';
					sel[7] = 'y';
				}
				if(max == c2){
					sel[2] = 'y';
					sel[5] = 'y';
					sel[8] = 'y';
				}
				if(max == d0){
					sel[0] = 'y';
					sel[4] = 'y';
					sel[8] = 'y';
				}
				if(max == d1){
					sel[2] = 'y';
					sel[4] = 'y';
					sel[6] = 'y';
				}

				do{
					position = (int)(Math.random() * 9) + 1;
					eval++;
				} while(sel[position - 1] == 'n' && eval < 5);

				y = yselector(position);
				x = xselector(position);
				if(position < 1 || position > 9){
					p1 = false;
					redo = true;
				}
				else{
					if(arr[y][x] == '-'){
						arr[y][x] = 'o';
						System.out.println("O - Computer selected position:\t\t\t\t\t" + position);
						p1 = true;
						redo = false;
					}
					else{
						p1 = false;
						redo = true;
					}
				}
			}
			board.repaint();

			for(int j = 0; j < arr.length; j++){
				if(arr[j][0] == arr[j][1] && arr[j][1] == arr[j][2]){
					if(arr[j][0] == 'x')
						win = 1;
					if(arr[j][0] == 'o')
						win = 2;
				}
			}
			for(int k = 0; k < arr.length; k++){
				if(arr[0][k] == arr[1][k] && arr[1][k] == arr[2][k]){
					if(arr[0][k] == 'x')
						win = 1;
					if(arr[0][k] == 'o')
						win = 2;
				}
			}
			if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
				if(arr[0][0] == 'x')
					win = 1;
				if(arr[0][0] == 'o')
					win = 2;
			}
			if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]){
				if(arr[0][2] == 'x')
					win = 1;
				if(arr[0][2] == 'o')
					win = 2;
			}

			if(win == 1){
				done = true;
				System.out.println("\nX - You Win!\n");
				board.setWinner("X - You Win!", textX, textY, textSize);
				board.showText(true);
			}
			if(win == 2){
				done = true;
				System.out.println("\nO - Computer Wins!\n");
				board.setWinner("O - Computer Wins!",textX, textY, textSize);
				board.showText(true);
			}
			for(int row = 0; row < arr.length; row++){
				for(int col = 0; col < arr[row].length; col++){
					if(arr[row][col] != '-' && win == 0){
						filled++;
					}
				}
			}
			if(filled == 9 && win == 0){
				done = true;
				System.out.println("\nTie!\n");
				board.setWinner("Tie!", textX, textY, textSize);
				board.showText(true);
			}
			else
				filled = 0;
		}

		while(game == 4){
			board.delay(50);
			if(done == false){
				if(p1 == true){
					position = (int)(Math.random() * 9) + 1;
					y = yselector(position);
					x = xselector(position);
					if(position < 1 || position > 9){
						p1 = false;
						redo = true;
					}
					else{
						if(arr[y][x] == '-'){
							arr[y][x] = 'x';
							System.out.println("X - Computer 1 selected position:\t\t\t\t\t" + position);
							p1 = false;
							redo = false;
						}
						else{
							p1 = true;
							redo = true;
						}
					}
				}
				else{
					position = (int)(Math.random() * 9) + 1;
					y = yselector(position);
					x = xselector(position);
					if(position < 1 || position > 9){
						p1 = false;
						redo = true;
					}
					else{
						if(arr[y][x] == '-'){
							arr[y][x] = 'o';
							System.out.println("O - Computer 2 selected position:\t\t\t\t\t" + position);
							p1 = true;
							redo = false;
						}
						else{
							p1 = false;
							redo = true;
						}
					}
				}
				board.repaint();

				for(int j = 0; j < arr.length; j++){
					if(arr[j][0] == arr[j][1] && arr[j][1] == arr[j][2]){
						if(arr[j][0] == 'x')
							win = 1;
						if(arr[j][0] == 'o')
							win = 2;
					}
				}
				for(int k = 0; k < arr.length; k++){
					if(arr[0][k] == arr[1][k] && arr[1][k] == arr[2][k]){
						if(arr[0][k] == 'x')
							win = 1;
						if(arr[0][k] == 'o')
							win = 2;
					}
				}
				if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
					if(arr[0][0] == 'x')
						win = 1;
					if(arr[0][0] == 'o')
						win = 2;
				}
				if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]){
					if(arr[0][2] == 'x')
						win = 1;
					if(arr[0][2] == 'o')
						win = 2;
				}

				if(win == 1){
					done = true;
					System.out.println("\nX - Computer 1 Wins!\n");
					board.setWinner("X - Computer 1 Wins!", textX, textY, textSize);
					board.showText(true);
				}
				if(win == 2){
					done = true;
					System.out.println("\nO - Computer 2 Wins!\n");
					board.setWinner("O - Computer 2 Wins!",textX, textY, textSize);
					board.showText(true);
				}
				for(int row = 0; row < arr.length; row++){
					for(int col = 0; col < arr[row].length; col++){
						if(arr[row][col] != '-' && win == 0){
							filled++;
						}
					}
				}
				if(filled == 9 && win == 0){
					done = true;
					System.out.println("\nTie!\n");
					board.setWinner("Tie!", textX, textY, textSize);
					board.showText(true);
				}
				else
					filled = 0;
			}
			else{
				board.delay(50);
				for(int row = 0; row < arr.length; row++){
					for(int col = 0; col < arr[row].length; col++)
						arr[row][col] = '-';
				}
				p1 = true;
				redo = false;
				win = 0;
				done = false;
				filled = 0;
				position = 0;
				y = 0;
				x = 0;
				board.showText(false);
			}
		}

	}

	public static int yselector(int position){
		int y = 0;
		switch(position){
			case 1: y = 0;
				break;
			case 2: y = 0;
				break;
			case 3: y = 0;
				break;
			case 4: y = 1;
				break;
			case 5: y = 1;
				break;
			case 6: y = 1;
				break;
			case 7: y = 2;
				break;
			case 8: y = 2;
				break;
			case 9: y = 2;
				break;
			default: System.out.println("!ERROR!");
				break;
		}
		return y;
	}

	public static int xselector(int position){
		int x = 0;
		switch(position){
			case 1: x = 0;
				break;
			case 2: x = 1;
				break;
			case 3: x = 2;
				break;
			case 4: x = 0;
				break;
			case 5: x = 1;
				break;
			case 6: x = 2;
				break;
			case 7: x = 0;
				break;
			case 8: x = 1;
				break;
			case 9: x = 2;
				break;
			default: System.out.println("!ERROR!");
				break;
		}
		return x;
	}

}