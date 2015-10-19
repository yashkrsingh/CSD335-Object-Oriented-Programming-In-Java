/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package PersonInheritance;
import java.util.Scanner;

public class Student extends Person{
	String status;
	
	public Student(){
		status = "Freshman";
	}
	
	public void setStudent(){
		int ch;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (1,2,3 or 4): ");
		ch = input.nextInt();
		switch(ch){
			case 1: this.status = "Freshman";
					break;
			case 2: this.status = "Sophomore";
					break;
			case 3: this.status = "Junior Year";
					break;
			case 4: this.status = "Senior Year";
					break;
		   default: this.status = "Freshman";
					break;
		}
	}
	
	public String toString(){
		return ("Name: "+name+"\n"+"Address: "+address+"\n"+"Phone number: "+phonenumber+"\n"+"Email id: "+emailid+"\nStatus: "+status);
	}
}
