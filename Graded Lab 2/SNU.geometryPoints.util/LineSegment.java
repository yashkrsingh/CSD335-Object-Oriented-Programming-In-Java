/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryPointsUtil;
import java.util.Scanner;

public class LineSegment {
	private int x1,y1,x2,y2;
	
	public LineSegment(){
		this.x1=0;
		this.y1=0;
		this.x2=0;
		this.y2=0;
	}
	
	public LineSegment(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	public void setFromUser(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x-coordinate for point 1: ");
		this.x1 = input.nextInt();
		System.out.print("Enter y-coordinate for point 1: ");
		this.y1 = input.nextInt();
		System.out.print("Enter x-coordinate for point 2: ");
		this.x2 = input.nextInt();
		System.out.print("Enter y-coordinate for point 2: ");
		this.y2 = input.nextInt();
	}
	
	public int getxCoordinatep1(){
		return x1;
	}
	
	public int getyCoordinatep1(){
		return y1;
	}
	
	public int getxCoordinatep2(){
		return x2;
	}
	
	public int getyCoordinatep2(){
		return y2;
	}
	
	public double getSide(int refX, int refY, int a, int b){
		return Math.pow(((refX - a)*(refX - a) + (refY - b)*(refY - b)),0.5);
	}
	
	public void isInside(PointTriangle t, LineSegment l){
		int flag1=0,flag2=0;
		int ref1X = t.getxCoordinatep1();
		int ref1Y = t.getyCoordinatep1();
		int ref2X = t.getxCoordinatep2();
		int ref2Y = t.getyCoordinatep2();
		int ref3X = t.getxCoordinatep3();
		int ref3Y = t.getyCoordinatep3();
		
		int X1 = l.getxCoordinatep1();
		int Y1 = l.getyCoordinatep1();
		int X2 = l.getxCoordinatep2();
		int Y2 = l.getyCoordinatep2();
		
		double s1 = l.getSide(ref1X, ref1Y, ref2X, ref2Y);
		double s2 = l.getSide(ref2X , ref2Y,ref3X , ref3Y);
		double s3 = l.getSide(ref1X, ref1Y, ref3X , ref3Y);
		
		double areaT = t.findArea();
		double a = l.getSide(ref1X, ref1Y, X1, Y1);
		double b = l.getSide(ref2X, ref2Y, X1, Y1);
		double c = l.getSide(ref3X, ref3Y, X1, Y1);
		double areaA = t.findArea(a, b, s1);
		double areaB = t.findArea(b, c, s2);
		double areaC = t.findArea(a, c, s3);
		if((int)areaT == (int)areaA + (int)areaB + (int)areaC){
			flag1 = 1;
		}
		else {
			flag1 = 0;
		}
		
		a = l.getSide(ref1X, ref1Y, X2, Y2);
		b = l.getSide(ref2X, ref2Y, X2, Y2);
		c = l.getSide(ref3X, ref3Y, X2, Y2);
		areaA = t.findArea(a, b, s1);
		areaB = t.findArea(b, c, s2);
		areaC = t.findArea(a, c, s3);
		if((int)areaT == (int)areaA + (int)areaB + (int)areaC){
			flag2 = 1;
		}
		else {
			flag2 = 0;
		}
		
		if(flag1==1 && flag2 == 1)
			System.out.print("\nLine Segment is inside the triangle");
		else 
			System.out.print("\nLine Segment is outside the triangle");
	}
	
	public void isInside(PointRectangle t, LineSegment l){
		int flag1=0,flag2=0;
		int ref1X = t.getxCoordinatep1();
		int ref1Y = t.getyCoordinatep1();
		int ref2X = t.getxCoordinatep2();
		int ref2Y = t.getyCoordinatep2();
		int ref3X = t.getxCoordinatep3();
		int ref3Y = t.getyCoordinatep3();
		int ref4X = t.getxCoordinatep4();
		int ref4Y = t.getyCoordinatep4();
		
		int X1 = l.getxCoordinatep1();
		int Y1 = l.getyCoordinatep1();
		int X2 = l.getxCoordinatep2();
		int Y2 = l.getyCoordinatep2();
		
		double s1 = l.getSide(ref1X, ref1Y, ref2X, ref2Y);
		double s2 = l.getSide(ref2X, ref2Y, ref3X , ref3Y);
		double s3 = l.getSide(ref3X , ref3Y,ref4X , ref4Y);
		double s4 = l.getSide(ref4X, ref4Y, ref1X, ref1Y);
		
		double areaR = t.findArea();
		double a = l.getSide(ref1X, ref1Y, X1, Y1);
		double b = l.getSide(ref2X, ref2Y, X1, Y1);
		double c = l.getSide(ref3X, ref3Y, X1, Y1);
		double d = l.getSide(ref4X, ref4Y, X1, Y1);
		double areaA = t.findArea(a, b, s1);
		double areaB = t.findArea(b, c, s2);
		double areaC = t.findArea(c, d, s3);
		double areaD = t.findArea(a, d, s4);
		if((int)areaR == (int)areaA + (int)areaB + (int)areaC + (int)areaD){
			flag1 = 1;
		}
		else {
			flag1 = 0;
		}
		
		a = l.getSide(ref1X, ref1Y, X2, Y2);
		b = l.getSide(ref2X, ref2Y, X2, Y2);
		c = l.getSide(ref3X, ref3Y, X2, Y2);
		d = l.getSide(ref4X, ref4Y, X2, Y2);
		areaA = t.findArea(a, b, s1);
		areaB = t.findArea(b, c, s2);
		areaC = t.findArea(c, d, s3);
		areaD = t.findArea(a, d, s4);
		if((int)areaR == (int)areaA + (int)areaB + (int)areaC + (int)areaD){
			flag2 = 1;
		}
		else {
			flag2 = 0;
		}
		
		if(flag1==1 && flag2 == 1)
			System.out.print("\nLine Segment is inside the rectangle");
		else 
			System.out.print("\nLine Segment is outside the rectangle");
	}
}
