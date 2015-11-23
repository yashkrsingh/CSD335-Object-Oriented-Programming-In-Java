/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
	Program Title: On each click H changes to T and vice versa L6
*/


package SNU.GUIUtil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class GUI3 extends JFrame{
	
	int flag = 0;
	int[][] matrix = new int[3][3];
	JPanel pmain = new JPanel();
	MyPanel[][] arr = new MyPanel[3][3];
	
	class MyPanel extends JPanel {
		
		JLabel info = new JLabel("H", SwingConstants.CENTER);
		int x,y;
		MyPanel(int x, int y){
			this.setLayout(new BorderLayout());
			this.x = x;
			this.y = y;
			this.addMouseListener(new MyListener());
			add(info,BorderLayout.CENTER);
		}
	
		class MyListener extends MouseAdapter{
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(flag ==1){
					info.setText("H");
					flag = 0;
				}
				else if(flag == 0){
					info.setText("T");
					flag = 1;
				}
			}
			
		}
	
	}
	
	GUI3(){
		LineBorder l = new LineBorder(Color.BLACK,1);
		pmain.setLayout(new GridLayout(3,3));
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = new MyPanel(i,j);
				arr[i][j].setSize(100,100);
				arr[i][j].setBorder(l);
				pmain.add(arr[i][j]);
			}
		}
		add(pmain);
	}
	
	public static void main(String[] args) {
		GUI3 frame = new GUI3();
		frame.setTitle("Heads or Tails");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
