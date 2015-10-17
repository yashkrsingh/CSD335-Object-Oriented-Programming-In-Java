/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryPointsUtil;
import java.util.Scanner;

public class PointTriangle {
	private int x1,x2,x3,y1,y2,y3;
	
	public PointTriangle(){
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.x3 = 0;
		this.y3 = 0;
	}
	
	public PointTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
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
	
	public double findArea(){
		double a = Math.pow(((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)),0.5);
		double b = Math.pow(((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3)),0.5);
		double c = Math.pow(((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1)),0.5);
		double s = (a+b+c)/2;
		double area = Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
		return area;
	}
	
	public double findArea(double a, double b, double c){
		double s = (a+b+c)/2;
		double area = Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
		return area;
	}
	
}
