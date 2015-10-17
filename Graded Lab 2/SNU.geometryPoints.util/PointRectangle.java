/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryPointsUtil;
import java.util.Scanner;

public class PointRectangle {
	private int x1,y1,x2,y2,x3,y3,x4,y4;
	
	public PointRectangle(){
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.x3 = 0;
		this.y3 = 0;
		this.x4 = 0;
		this.y4 = 0;
	}
	
	public PointRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	public void setFromUser(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x-coordinate for vertex 1: ");
		this.x1 = input.nextInt();
		System.out.print("Enter y-coordinate for vertex 1: ");
		this.y1 = input.nextInt();
		System.out.print("Enter x-coordinate for vertex 2: ");
		this.x2 = input.nextInt();
		System.out.print("Enter y-coordinate for vertex 2: ");
		this.y2 = input.nextInt();
		System.out.print("Enter x-coordinate for vertex 3: ");
		this.x3 = input.nextInt();
		System.out.print("Enter y-coordinate for vertex 3: ");
		this.y3 = input.nextInt();
		System.out.print("Enter x-coordinate for vertex 4: ");
		this.x4 = input.nextInt();
		System.out.print("Enter y-coordinate for vertex 4: ");
		this.y4 = input.nextInt();
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
	
	public int getxCoordinatep3(){
		return x3;
	}
	
	public int getyCoordinatep3(){
		return y3;
	}
	
	public int getxCoordinatep4(){
		return x4;
	}
	
	public int getyCoordinatep4(){
		return y4;
	}
	
	public double findArea(){
		double l = Math.pow(((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)),0.5);
		double b = Math.pow(((x1 - x4)*(x1 - x4) + (y1 - y4)*(y1 - y4)),0.5);
		return (l*b);
	}
	
	public double findArea(double a, double b, double c){
		double s = (a+b+c)/2;
		double area = Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
		return area;
	}
}
