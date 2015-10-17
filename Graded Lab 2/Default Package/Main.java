/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Check if a line segment lies in a given rectangle or triangle or not GL2
*/

import SNU.geometryPointsUtil.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		boolean cont = true;
		int choice;
		int ch;
		Scanner input = new Scanner(System.in);
		LineSegment l1 = new LineSegment();
		l1.setFromUser();
		do{
			System.out.print("\nMENU");
			System.out.print("\n1.Check for a triangle");
			System.out.print("\n2.Check for a rectangle");
			System.out.print("\nEnter what you want to do ");
			ch = input.nextInt();
			switch(ch){
			case 1: PointTriangle t1 = new PointTriangle();
					t1.setFromUser();
					l1.isInside(t1, l1);
					break;
			case 2: PointRectangle r1 = new PointRectangle();
					r1.setFromUser();
					l1.isInside(r1, l1);
					break;
			default: System.out.print("Invalid input!!");
					 break;
			}
			System.out.print("\nDo you want to continue? (1/0) ");
			choice = input.nextInt();
			if(choice==0)
				cont = false;
		}while(cont);
	}

}
