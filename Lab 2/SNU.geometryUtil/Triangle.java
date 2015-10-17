/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryUtil;
import java.util.Scanner;

public class Triangle{
	static private int count=0;
	private double side1,side2,side3;
	
	public Triangle(){
		this.side1=3;
		this.side2=4;
		this.side3=5;
		count++;
	}
	
	public Triangle(double s1, double s2, double s3){
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
		count++;
	}
	
	public double getSide1(){
		return this.side1;
	}
	
	public double getSide2(){
		return this.side2;
	}
	
	public double getSide3(){
		return this.side3;
	}
	
	public void setDimensions(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		this.side1 = input.nextDouble();
		System.out.print("Enter side 2: ");
		this.side2 = input.nextDouble();
		System.out.print("Enter side 3: ");
		this.side3 = input.nextDouble();
	}
	
	public double getArea(){
		double s = (this.side1+this.side2+this.side3)/2;
		return Math.pow((s*(s-side1)*(s-side2)*(s*side3)), 0.5);
	}
	
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	public int returnObjects(){
		return count;
	}
}
