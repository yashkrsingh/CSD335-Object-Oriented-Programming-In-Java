/*  Name		 : Yash Kumar Singh
    Roll Number  	 : 1310110373
    Major		 : Computer Science and Engineering
*/


package SNU.geometryUtil;
import java.util.Scanner;

public class ConcentricCircle extends GeometricObject implements Colorable{
	private double r1,r2;
	static int count=0;
	
	public ConcentricCircle(){
		this.r1=1;
		this.r2=2;
		count++;
	}
	
	public ConcentricCircle(double r1,double r2) throws IllegalConcentricCircleException,IllegalCircleException{
		if(r1<0 || r2<0)
			throw new IllegalCircleException("Radius is invalid");
		if(r1 > r2)
			throw new IllegalConcentricCircleException("Radius1 is bigger than radius2");
		else{
			this.r1=r1;
			this.r2=r2;
			count++;
		}
	}
	
	public double getRadius1(){
		return this.r1;
	}
	
	public double getRadius2(){
		return this.r2;
	}
	
	public void setRadius() throws IllegalConcentricCircleException,IllegalCircleException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius 1: ");
		double r1 = input.nextDouble();
		System.out.print("Enter radius 2: ");
		double r2 = input.nextDouble();
		if(r1<0 || r2<0)
			throw new IllegalCircleException("Radius is invalid");
		if(r1 < r2)
			throw new IllegalConcentricCircleException("Radius1 is bigger than radius2");
		else{
			this.r1 = r1;
			this.r2 = r2;
		}
	}
	
	@Override
	public double costToColor(double c) {
		double cost = c * this.getArea();
		return cost;
	}

	@Override
	public double getArea() {
		double area1 = Math.PI * this.r1 * this.r1;
		double area2 = Math.PI * this.r2 * this.r2;
		return (area2 - area1);
	}

	@Override
	public double getPerimeter() {
		return (Math.PI*2*this.r2);
	}

	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		
	}
	
}
