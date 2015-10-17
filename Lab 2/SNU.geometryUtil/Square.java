/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryUtil;
import java.util.Scanner;

public class Square{
	static private int count=0;
	private double side;
	
	public Square(){
		this.side=1;
		count++;
	}
	
	public Square(double s){
		this.side=s;
		count++;
	}
	
	public double getSide(){
		return this.side;
	}
	
	public void setSide(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side: ");
		this.side = input.nextDouble();
	}
	
	public double getArea(){
		return (Math.pow(this.side, 2));
	}
	
	public double getPerimeter(){
		return (4*this.side);
	}
	
	public int returnObjects(){
		return count;
	}
}
