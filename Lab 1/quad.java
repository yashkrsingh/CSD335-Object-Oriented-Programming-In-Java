/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Quadratic Equation Roots L1 
*/

import java.util.Scanner;
import java.lang.Math;

public class quad{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a,b,c;
		double D,r1,r2;		
		System.out.println("Enter the coefficient of X^2");
		a = input.nextInt();
		System.out.println("Enter the coefficient of X");
		b = input.nextInt();
		System.out.println("Enter the constant term");
		c = input.nextInt();
		D = (b*b)-(4*a*c);
		if(D>0){
			r1 = (-b + Math.pow(D,0.5))/2*a;
			r2 = (-b - Math.pow(D,0.5))/2*a;
			System.out.println("Roots are real and distinct");
			System.out.println("Roots are:" +r1+ " and " +r2);
		}
		else if(D==0){
			r1 = (-b + Math.pow(D,0.5))/2*a;
			r2 = (-b - Math.pow(D,0.5))/2*a;
			System.out.println("Roots are equal");
			System.out.println("Roots are:" +r1+ " and " +r2);
		}
		else if(D<0){
			System.out.println("Roots are imaginary");
			System.out.println("Roots are:" +(-b/2*a)+"+"+Math.pow(-D,0.5)+"i");
			System.out.println("Roots are:" +(-b/2*a)+"-"+Math.pow(-D,0.5)+"i");
		}
	}
}
