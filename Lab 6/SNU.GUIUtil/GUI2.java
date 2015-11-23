/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
	Program Title: Drag a circle L6
*/


package SNU.GUIUtil;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI2 extends JFrame{
	
	int flag =0;
	MyPanel pmain = new MyPanel();
	Point center = new Point(45,45);
	
	class MyPanel extends JPanel{
		Point newPoint = new Point(30,30);
		
		MyPanel(){
			this.addMouseMotionListener(new MyListener());
		}
		
		class MyListener extends MouseMotionAdapter{
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if(center.distance(e.getPoint()) < 15){
					newPoint= e.getPoint();
					center = newPoint;
					flag = 1;
					repaint();
				}
			}
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
				g.drawOval(newPoint.x - 15, newPoint.y - 15, 30,30);
			}
	}
	
	GUI2(){
		add(pmain);
	}
	
	public static void main(String[] args) {
		GUI2 frame = new GUI2();
		frame.setTitle("Drag Circle");
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
