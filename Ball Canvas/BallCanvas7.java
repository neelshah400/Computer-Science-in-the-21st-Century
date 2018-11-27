public class BallCanvas7{
	public static void main(String[]args){


		BallCanvas ballCanvas = new BallCanvas(0,0);
		int xPos = 0;
		int yPos = 512;

		ballCanvas.moveBall(0,512);
		ballCanvas.delay(500);
		ballCanvas.repaint();

		for(xPos = 0; xPos <= 538; xPos ++){
			/*
			Quadratic function (vertex form)
				y = a(x - h)^2 + k where the vertex is (h,k)
			Substitute (xPos,yPos) in for (x,y) and (268.0, 0) in for (h,k)
				yPos = (int)((a * (xPos - 268.0) * (xPos - 268.0)) + 0.0);
				yPos = (int)(a * (xPos - 268.0) * (xPos - 268.0));
			Substitute (538.0,512.0) in for (xPos,yPos) and solve for a
				512.0 = (a * (538.0 - 267.0) * (538 - 267.0))
				512.0 = a * 271.0 * 271.0
				a = 512 / (271.0 * 271.0)
				a = 512.0 / 73441.0
				a = 0.00697
			Substitute 0.00697 in for a to get the final equation
				yPos = (int)((0.00697 * (xPos - 268.0) * (xPos - 268.0)));
			*/
			yPos = (int)((0.00697 * (xPos - 268) * (xPos - 268)));

			ballCanvas.moveBall(xPos,yPos);
			ballCanvas.delay(5);
			ballCanvas.repaint();
		}
	}
}