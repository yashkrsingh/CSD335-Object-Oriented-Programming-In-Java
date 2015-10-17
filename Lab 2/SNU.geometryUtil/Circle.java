/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/
package SNU.geometryUtil;
import java.util.Scanner;

public class Circle{
	static private int count=0;
	private double radius;
	
	public Circle(){
		this.radius=1;
		count++;
	}
	
	public Circle(double r){
		this.radius=r;
		count++;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		this.radius = input.nextDouble();
	}
	
	public double getArea(){
		return (Math.PI*Math.pow(this.radius, 2));
	}
	
	public double getPerimeter(){
		return (Math.PI*2*this.radius);
	}
	
	public int returnObjects(){
		return count;
	}
}
