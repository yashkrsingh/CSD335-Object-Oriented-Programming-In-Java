/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryUtil;
import java.util.Scanner;

public class Rectangle extends GeometricObject{
	private double length,breadth;
	static int count=0;
	
	public Rectangle(){
		this.length=1;
		this.breadth=0.5;
		count++;
	}
	
	public Rectangle(double l, double b){
		this.length=l;
		this.breadth=b;
		count++;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getBreadth(){
		return this.breadth;
	}
	
	public void setDimensions(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		this.length = input.nextDouble();
		System.out.print("Enter breadth: ");
		this.breadth = input.nextDouble();
	}
	
	public double getArea(){
		return (length*breadth);
	}
	
	public double getPerimeter(){
		return (2*(length+breadth));
	}
	
	public int returnObjects(){
		return count;
	}
}

