/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryUtil;
import java.util.Scanner;

public class Triangle extends GeometricObject{
	private double side1,side2,side3;
	static int count=0;
	
	public Triangle(){
		this.side1=3;
		this.side2=4;
		this.side3=5;
		count++;
	}
	
	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException{
		if((s1+s2 < s3) || (s2+s3 < s1) || (s1+s3 < s2)){
			throw new IllegalTriangleException("Sum of two sides should be greater than the third one.");
		}
		else {
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
		count++;
		}
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
	
	public void setDimensions() throws IllegalTriangleException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		this.side1 = input.nextDouble();
		System.out.print("Enter side 2: ");
		this.side2 = input.nextDouble();
		System.out.print("Enter side 3: ");
		this.side3 = input.nextDouble();
		if((side1+side2 < side3) || (side2+side3 < side1) || (side1+side3 < side2)){
			throw new IllegalTriangleException("Sum of two sides should be greater than the third one.");
		}
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

