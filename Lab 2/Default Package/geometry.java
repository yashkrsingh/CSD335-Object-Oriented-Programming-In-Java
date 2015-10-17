/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Implementing classes, objects and static variables L2
*/

import SNU.geometryUtil.*;
import java.util.Scanner;

public class geometry {

	public static void main(String[] args) {
		int str=1;
		do{
			System.out.println("MAIN MENU");
			System.out.println("1.Create Circle object and perform operations");
			System.out.println("2.Create Rectangle object and perform operations");
			System.out.println("3.Create Triangle object and perform operations");
			System.out.println("4.Create Square object and perform operations");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter choice ");
			int ch = input.nextInt();
			System.out.println();
			switch(ch){
			case 1: Circle c = new Circle();
					c.setRadius();
					System.out.println("MENU");
					System.out.println("1.Calculate Area");
					System.out.println("2.Calculate Perimeter");
					System.out.println("3.Find the number of total objects created");
					System.out.print("Enter your choice ");
					int ch2 = input.nextInt();
					switch(ch2){
					case 1: double area = c.getArea();
							System.out.print("Area of circle: "+area);
							break;
					case 2: double perimeter = c.getPerimeter();
							System.out.print("Area of perimeter: "+perimeter);
							break;
					case 3: System.out.print(c.returnObjects());
							break;
					}
					break;
			
			case 2: Rectangle rect = new Rectangle();
					rect.setDimensions();
					System.out.println("MENU");
					System.out.println("1.Calculate Area");
					System.out.println("2.Calculate Perimeter");
					System.out.println("3.Find the number of total objects created");
					System.out.print("Enter your choice ");
					int ch3 = input.nextInt();
					System.out.println();
					switch(ch3){
					case 1: double area = rect.getArea();
							System.out.print("Area of Rectangle: "+area);
							break;
					case 2: double perimeter = rect.getPerimeter();
							System.out.print("Perimeter of Rectangle: "+perimeter);
							break;
					case 3: System.out.print(rect.returnObjects());
							break;
					}
					break;
					
			case 3: Triangle t = new Triangle();
					t.setDimensions();
					System.out.println("MENU");
					System.out.println("1.Calculate Area");
					System.out.println("2.Calculate Perimeter");
					System.out.println("3.Find the number of total objects created");
					System.out.print("Enter your choice ");
					int ch4 = input.nextInt();
					System.out.println();
					switch(ch4){
					case 1: double area = t.getArea();
							System.out.print("Area of Triangle: "+area);
							break;
					case 2: double perimeter = t.getPerimeter();
							System.out.print("Perimeter of Triangle: "+perimeter);
							break;
					case 3: System.out.print(t.returnObjects());
							break;
					}
					break;
			
			case 4: Square sq = new Square();
					sq.setSide();
					System.out.println("MENU");
					System.out.println("1.Calculate Area");
					System.out.println("2.Calculate Perimeter");
					System.out.println("3.Find the number of total objects created");
					System.out.print("Enter your choice ");
					int ch5 = input.nextInt();
					System.out.println();
					switch(ch5){
					case 1: double area = sq.getArea();
							System.out.print("Area of circle: "+area);
							break;
					case 2: double perimeter = sq.getPerimeter();
							System.out.print("Area of perimeter: "+perimeter);
							break;
					case 3: System.out.print(sq.returnObjects());
							break;
					}
					break;
					
			default: System.out.print("Invalid Option!!");		
			}
			System.out.print("\nDo you wish to continue? (0/1) ");
			str = input.nextInt();
		}while(str!=0);
	}
}
