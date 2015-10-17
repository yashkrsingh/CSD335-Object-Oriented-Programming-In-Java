/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Point inside the circle or outside L1 
*/

import java.util.Scanner;

public class dist{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x,y;
		int cx,cy,cr;
		System.out.print("Enter the x-coordinate for center of circle: ");
		cx = input.nextInt();
		System.out.print("Enter the y-coordinate for center of circle: ");
		cy = input.nextInt();
		System.out.print("Enter radius of the circle: ");
		cr = input.nextInt();
		double d2,r2;	
		r2 = Math.pow(cr,2);	
		System.out.print("Enter the x-coordinate: ");
		x = input.nextInt();
		System.out.print("Enter the y-coordinate: ");
		y = input.nextInt();
		d2 = Math.pow(x,2)+Math.pow(y,2);
		if(d2<r2){
			System.out.println("Point is inside the circle");
		}
		else if(d2>r2){
			System.out.println("Point is outside the circle");
		}
	}
}
