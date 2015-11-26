/*  Name		 : Yash Kumar Singh
    Roll Number  	 : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.GUIUtil;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RotateRectangle extends JFrame{
	
	MyPanel panel = new MyPanel();
	public RotateRectangle(){
		add(panel);
	}
	
	class MyPanel extends JPanel{
		int l=80;
		int b=40;
		int angle1=330,angle2=30,angle3=150,angle4=210;
		int delta = 0;
		
		public MyPanel() {
		addKeyListener(new KeyAdapter() {
		 public void keyPressed(KeyEvent e) {
			 switch (e.getKeyCode()) {
			 case KeyEvent.VK_RIGHT: delta += 10;
			 break;
			 case KeyEvent.VK_LEFT: delta -= 10;
			 break;
			 }
			 repaint();
		 }});
		setFocusable(true);
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x1 = getWidth()/2;
			int y1 = getHeight()/2;
			int dist = 100;
			int x2 = x1+(int)(dist*Math.cos(Math.toRadians(angle1+delta)));
			 int y2 = y1+(int)(dist*Math.sin(Math.toRadians(angle1+delta)));
			 int x3 = x1+(int)(dist*Math.cos(Math.toRadians(angle2+delta)));
			 int y3 = y1+(int)(dist*Math.sin(Math.toRadians(angle2+delta)));
			 int x4 = x1+(int)(dist*Math.cos(Math.toRadians(angle3+delta)));
			 int y4 = y1+(int)(dist*Math.sin(Math.toRadians(angle3+delta)));
			 int x5 = x1+(int)(dist*Math.cos(Math.toRadians(angle4+delta)));
			 int y5 = y1+(int)(dist*Math.sin(Math.toRadians(angle4+delta)));
			 g.drawLine(x2,y2,x3,y3);
			 g.drawLine(x4,y4,x3,y3);
			 g.drawLine(x4,y4,x5,y5);
			 g.drawLine(x2,y2,x5,y5);
		}
	}
	
	public static void main(String[] args) {
		RotateRectangle frame = new RotateRectangle();
		frame.setTitle("Rotate Rectangle");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
