/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
	Program Title: Check if pointer is inside figure L6
*/

package SNU.GUIUtil;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI1 extends JFrame{
	
	int flag = 3;
	JPanel poutput = new JPanel();
	MyPanel pmain = new MyPanel();
	JLabel info = new JLabel();
	
	class MyListener implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent e) {}

		@Override
		public void mouseMoved(MouseEvent e) {
			Point p = e.getPoint();
			if(flag == 1){
				checkCircle(p);
			}
			if(flag == 2){
				checkRectangle(p);
			}
			if(flag == 3){
				checkTriangle(p);
			}
		}
	}
	
	class MyPanel extends JPanel{
		
		public MyPanel() {
			addMouseMotionListener(new MyListener());
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			if(flag == 1){
				g.drawOval(getWidth()/2 - 70, getHeight()/2 - 70, 140, 140);
			}
			if(flag == 2){
				g.drawRect(getWidth()/2 - 90, getHeight()/2 - 45, 180, 90);
			}
			if(flag == 3){
				g.drawLine(100, 50, 300, 100);
				g.drawLine(300, 100, 200, 200);
				g.drawLine(200, 200, 100, 50);
			}
		}
	}
	
	GUI1(int x){
		flag = x;
		setLayout(new BorderLayout());
		
		poutput.add(info);
		add(pmain);
		add(info, BorderLayout.SOUTH);
	}
	
	void checkCircle(Point p){
		double d = ((p.x - (pmain.getWidth()/2))*(p.x - (pmain.getWidth()/2)) + (p.y - (pmain.getHeight()/2))*(p.y - (pmain.getHeight()/2)));
		if(d > 70*70)
			info.setText("Point is not in the circle");
		else
			info.setText("Point is in the circle");
		repaint();
	}
	
	void checkRectangle(Point p){
		if(p.y > (pmain.getHeight()/2 - 45) && p.y < (pmain.getHeight()/2 - 45 + 90) && p.x > (pmain.getWidth()/2 - 90) && p.x < (pmain.getWidth()/2 - 90 + 180))
			info.setText("Point is in the rectangle");
		else
			info.setText("Point is not in the rectangle");
		repaint();
	}
	
	void checkTriangle(Point p){
		double area = 12500.00;
		Point p1 = new Point(300,100);
		Point p2 = new Point(100,50);
		Point p3 = new Point(200,200);
		double s3 = p1.distance(p2);
		double s1 = p2.distance(p3);
		double s2 = p3.distance(p1);
		double a = p.distance(p1);
		double b = p.distance(p2);
		double c = p.distance(p3);
		double sm1 = (a+s2+c)/2;
		double sm2 = (a+b+s3)/2;
		double sm3 = (s1+b+c)/2;
		double area1 = Math.pow((sm1*(sm1-a)*(sm1-s2)*(sm1-c)),0.5);
		double area2 = Math.pow((sm2*(sm2-a)*(sm2-b)*(sm2-s3)),0.5);
		double area3 = Math.pow((sm3*(sm3-s1)*(sm3-b)*(sm3-c)),0.5);
		if(((area1+area2+area3) - area) < 0.01)
			info.setText("Point is in the triangle");
		else
			info.setText("Point is not in the triangle");
		repaint();
	}
	
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Which object to create?\n1.Circle\n2.Rectangle\n3.Triangle");
		int f = Integer.parseInt(s);
		GUI1 frame = new GUI1(f);
		frame.setTitle("Mouse inside figure");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
