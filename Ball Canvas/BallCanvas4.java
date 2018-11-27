public class BallCanvas4{
	public static void main(String[]args){

		BallCanvas ballCanvas = new BallCanvas(0,0);

		int xPos = 250;

		for(int yPos = 0; yPos < 512; yPos++){

			ballCanvas.moveBall(xPos,yPos);
			ballCanvas.delay(3);
			ballCanvas.repaint();

		}

		for(xPos = 250; xPos <= 300; xPos++){

			ballCanvas.moveBall(xPos,512);
			ballCanvas.delay(3);
			ballCanvas.repaint();

		}

		for(int yPos = 512; yPos >0; yPos--){

			ballCanvas.moveBall(xPos,yPos);
			ballCanvas.delay(3);
			ballCanvas.repaint();

		}

	}
}