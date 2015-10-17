/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Pattern GL1 
*/
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of lines to print: ");
		int n = input.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}

