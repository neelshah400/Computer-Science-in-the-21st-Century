public class BallCanvas5{
	public static void main(String[]args){

		BallCanvas ballCanvas = new BallCanvas(0,0);

		int mode = 1;

		for(int yPos = 0; mode != 0; yPos += mode){

			ballCanvas.moveBall(0,yPos);
			ballCanvas.delay(3);
			ballCanvas.repaint();

			if(yPos == 512)
				mode = -1;
			if(yPos == 0 && mode == -1)
				mode = 0;

		}


	}
}