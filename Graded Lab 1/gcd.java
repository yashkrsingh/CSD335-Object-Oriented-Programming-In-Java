/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Calculate the gcd of two numbers GL1 
*/
import java.util.Scanner;

public class gcd{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.print("Enter first integer ");
		a = input.nextInt();
		System.out.print("Enter second integer ");
		b = input.nextInt();
		int d,gcd=0;
		if(a<b)
			d = a;
		else
			d = b;
		while(d!=0){
			if(a%d==0 && b%d==0){
				gcd = d;
				break;
			}
			else
			d = d - 1;
		}
		System.out.print("GCD of "+a+" and "+b+" is "+gcd);
	}
}
