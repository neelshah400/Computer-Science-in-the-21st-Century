import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

import java.awt.Image;
import java.awt.Toolkit;

public class Test extends JPanel implements Runnable{
	JFrame frame;
	boolean runLoop;
	Thread thread;
	int x;

	public Test(){
		x=20;
		runLoop=true;
		thread=new Thread(this);
		frame=new JFrame();
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,800);
		frame.setVisible(true);
		thread.start();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0,0,1000,800);

		g.setColor(new Color(228,189,26));
		g.fillRoundRect(40,50,200,200,50,50);
		g.fillRoundRect(280,50,200,200,50,50);
		g.fillRoundRect(520,50,200,200,50,50);
		g.fillRoundRect(760,50,200,200,50,50);

		g.setFont(new Font("Calibri",Font.PLAIN,75));
		g.drawString("C O M P U T E R • S C I E N C E",50,325);

		g.setFont(new Font("Calibri",Font.PLAIN,30));
		g.drawString("By: Neel Shah",825,790);

		g.setFont(new Font("Calibri",Font.ITALIC,45));
		g.drawString("Java Courses",75,700);
		g.drawString("Mobile App",400,680);
		g.drawString("Development",383,725);
		g.drawString("Data Structures",686,680);
		g.drawString("& Game Design",686,725);

		Image img_java = Toolkit.getDefaultToolkit().getImage("img_java.png");
		g.drawImage(img_java, 70, 375, this);

		Image img_mobile = Toolkit.getDefaultToolkit().getImage("img_mobile.png");
		g.drawImage(img_mobile, 383, 375, this);

		Image img_data = Toolkit.getDefaultToolkit().getImage("img_data.png");
		g.drawImage(img_data, 701, 375, this);

		g.fillRoundRect(333,350,5,390,5,5);
		g.fillRoundRect(666,350,5,390,5,5);

		g.setColor(new Color(0,0,0));
		g.setFont(new Font("Calibri",Font.BOLD,250));
		g.drawString("S",80,225);
		g.drawString("B",310,225);
		g.drawString("H",540,225);
		g.drawString("S",800,225);

	}

	public void run(){
		while(runLoop){
			if(x<900)
				x+=10;
			repaint();
			try{
				thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}

	public static void main(String args[]){
		Test app = new Test();
	}

}
