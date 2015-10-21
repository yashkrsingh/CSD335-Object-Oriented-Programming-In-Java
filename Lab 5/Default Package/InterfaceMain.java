/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Interfaces L5
*/

import SNU.geometryUtil.*;
import java.util.Scanner;
public class InterfaceMain {

	public static void main(String[] args) {
		
		Square s1 = new Square();
		s1.howToColor();
		System.out.println("\n");
	
		Scanner input = new Scanner(System.in);
		GeometricObject[] arr = new GeometricObject[5];
		for(int i=0;i<5;i++){
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
		
		for(int i=0;i<5;i++){
			if(arr[i] instanceof Colorable){
				System.out.print("\nCalling howToColor() for arr["+i+"]: ");
				((Colorable) arr[i]).howToColor();
			}
		}
	
	}
}
