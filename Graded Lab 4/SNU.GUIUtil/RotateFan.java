/*  Name		 : Yash Kumar Singh
    Roll Number  	 : 1310110373
    Major		 : Computer Science and Engineering
    Program Title 	 : Rotate Fan GL4
*/

package SNU.GUIUtil;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RotateFan extends JFrame{
	
	int flag = 0;
	public class MyPanel extends JPanel{
		int xCenter, yCenter;
		int fanRadius, bladeLength;
		int angle = 100;
		int directionl = 15;
		int directionr = -15;
		
		MyPanel(){
			this.addKeyListener(new MyListener());
			this.setFocusable(true);
		}
				
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			fanRadius = (int)(Math.min(getSize().width, getSize().height)*0.9*0.5);
			xCenter = (getSize().width)/2;
			yCenter = (getSize().height)/2;
			bladeLength = (int)(fanRadius*0.9);
			if(flag == 1)
				angle = (angle+directionr)%360;
			else if(flag == -1)
				angle = (angle+directionl)%360;
			g.setColor(Color.black);
			g.drawOval(xCenter - fanRadius,yCenter - fanRadius,
			2*fanRadius, 2*fanRadius);
			
			drawBlade(g, angle);
			drawBlade(g, angle+90);
			drawBlade(g, angle+180);
			drawBlade(g, angle+270);
		}
				
		private void drawBlade(Graphics g, int angle) {
			g.setColor(Color.black);
			g.fillArc(xCenter-bladeLength, yCenter-bladeLength,
			2*bladeLength, 2*bladeLength, angle, 30);
		}
	}
		
	public class MyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_RIGHT: flag = 1;
										repaint();
										break;
				case KeyEvent.VK_LEFT:	flag = -1;
										repaint();
										break;
			}
		}
	}
		
	RotateFan(){
		MyPanel pmain = new MyPanel();
		add(pmain);
	}
		
	public static void main(String[] args) {
		RotateFan frame = new RotateFan();
		frame.setTitle("Rotate Fan");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
