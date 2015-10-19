/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package PersonInheritance;
import java.util.Scanner;

public class Staff extends Employee{
	String title;
	
	public Staff(){
		title = "Android App Developer";
	}
	
	public void setStaff(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter title: ");
		this.title = input.nextLine();
	}
	
	public String toString(){
		return("Name: "+name+"\n"+"Address: "+address+"\n"+"Phone number: "+phonenumber+"\n"+"Email id: "+emailid+"\nOffice: "+office+"\nSalary: "+salary+"\nDate of joining: "+d1.year+"-"+d1.month+"-"+d1.day+"\nTitle: "+title);
	}
}
