public class BallCanvas6{
	public static void main(String[]args){

		BallCanvas ballCanvas = new BallCanvas(0,0);

		int xPos = 1;
		int yPos = 1;
		int xChange = 1;
		int yChange = 1;
		int counter = 0;
		int exit = 0;

		for(yPos = 1; exit != 1; yPos += yChange){
			xPos += xChange;

			if(yPos <= 0 || yPos >= 512){
				yChange *= -1;
				counter++;
			}
			if(xPos <= 0 || xPos >= 537){
				xChange *= -1;
				counter++;
			}

			ballCanvas.moveBall(xPos,yPos);
			ballCanvas.delay(3);
			ballCanvas.repaint();
			if(counter >= 33)
				exit = 1;
		}
	}
}