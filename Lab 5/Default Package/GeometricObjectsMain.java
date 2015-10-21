/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Abstract Classes L5
*/

import SNU.geometryUtil.*;
import java.util.Scanner;

public class GeometricObjectsMain {
	
	static int max(GeometricObject o1, GeometricObject o2){
		if(o1.getArea() > o2.getArea())
			return 1;
		else 
			return 0;
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of objects: ");
		int c = input.nextInt();
		GeometricObject[] arr = new GeometricObject[c];
		for(int i=0;i<c;i++){
			System.out.print("Which object for arr["+i+"] would you like to create: ");
			System.out.print("\n1.Circle");
			System.out.print("\n2.Rectangle");
			System.out.print("\n3.Square");
			System.out.print("\n4.Triangle ");
			int x = input.nextInt();
			switch(x){
			case 1: System.out.println();
					System.out.print("Enter radius: ");
					double r = input.nextDouble();
					arr[i] = new Circle(r);
					break;
			case 2: System.out.println();
					System.out.print("Enter length: ");
					double l = input.nextDouble();
					System.out.print("Enter breadth: ");
					double b = input.nextDouble();
					arr[i] = new Rectangle(l,b);
					break;
			case 3: System.out.println();
					System.out.print("Enter side: ");
					double s = input.nextDouble();
					arr[i] = new Square(s);
					break;
			case 4: try {
					System.out.println();
					System.out.print("Enter side 1: ");
					double side1 = input.nextDouble();
					System.out.print("Enter side 2: ");
					double side2 = input.nextDouble();
					System.out.print("Enter side 3: ");
					double side3 = input.nextDouble();
					arr[i] = new Triangle(side1,side2,side3);
					} catch (IllegalTriangleException e) {
					e.printStackTrace();
				}
					break;
			}
		}
		
		double price = 18.88;
		double cost=0;
		for(int i=0;i<c;i++){
			cost = arr[i].costOfPaintingShape(price) + cost;
		}
		System.out.printf("Cost of painting every object in the array (18.88$/m2): %.2f$", cost);		
		
		System.out.print("\n\nComparison of Geometric Objects\n");
		System.out.print("1. Two Circles\n");
		System.out.print("Enter radius 1: ");
		double r = input.nextDouble();
		GeometricObject o1 = new Circle(r);
		System.out.print("Enter radius 2: ");
		r = input.nextDouble();
		GeometricObject o2 = new Circle(r);
		int ch = max(o1,o2);
		if(ch==1)
			System.out.print("\nCircle 1 is greater");
		else
			System.out.print("\nCircle 2 is greater");
		
		System.out.print("\n\n2. Two Rectangle\n");
		System.out.print("Enter length 1: ");
		double l = input.nextDouble();
		System.out.print("Enter breadth 1: ");
		double b = input.nextDouble();
		GeometricObject o3 = new Rectangle(l,b);
		System.out.print("Enter length 2: ");
		l = input.nextDouble();
		System.out.print("Enter breadth 2: ");
		b = input.nextDouble();
		GeometricObject o4 = new Rectangle(l,b);
		ch = max(o3,o4);
		if(ch==1)
			System.out.print("\nRectangle 1 is greater");
		else
			System.out.print("\nRectangle 2 is greater");
	}

}
