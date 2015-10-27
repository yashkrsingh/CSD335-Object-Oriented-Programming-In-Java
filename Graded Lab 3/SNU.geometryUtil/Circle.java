/*  Name		 : Yash Kumar Singh
    Roll Number  	 : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.geometryUtil;
import java.util.Scanner;

public class Circle extends GeometricObject implements Colorable{
	private double radius;
	static int count=0;
	
	public Circle(){
		this.radius=1;
		count++;
	}
	
	public Circle(double r) throws IllegalCircleException{
		if(r < 0)
			throw new IllegalCircleException("Radius is invalid");
		else{
			this.radius=r;
			count++;
		}
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius() throws IllegalCircleException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = input.nextDouble();
		if(r < 0)
			throw new IllegalCircleException("Radius is invalid");
		else 
			this.radius = r;
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

	@Override
	public double costToColor(double c){
		double cost = c * this.getArea();
		return cost;
	}

	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		
	}
	
}

