public class BallCanvas2{
	public static void main(String[]args){

		BallCanvas ballCanvas = new BallCanvas(0,0);

		for(int yPos = 0; yPos < 512; yPos ++){ // Make yPos increase by more each time - e.g. yPos += 10 (this means that the ball will fall a greater distance in the same amount of time)

			ballCanvas.moveBall(0,yPos);
			ballCanvas.delay(5); // Decrease the delay - e.g. ballCanvas.delay(1) (this means that the ball will fall the same distance in less time)
			ballCanvas.repaint();

		}

	}
}