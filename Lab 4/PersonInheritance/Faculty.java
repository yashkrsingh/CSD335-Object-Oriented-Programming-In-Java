/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package PersonInheritance;
import java.util.Scanner;

public class Faculty extends Employee{
	int officehoursstart;
	int officehoursend;
	String rank;
	
	public Faculty(){
		officehoursstart = 2;
		officehoursend = 5;
		rank = "Assistant Professor";
	}
	
	public void setFaculty(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter office hours start: ");
		this.officehoursstart = input.nextInt();
		System.out.print("Enter office hours end: ");
		this.officehoursend = input.nextInt();
		System.out.print("Enter rank: ");
		this.rank = input.nextLine();
	}
	
	public String toString(){
		return("Name: "+name+"\n"+"Address: "+address+"\n"+"Phone number: "+phonenumber+"\n"+"Email id: "+emailid+"\nOffice: "+office+"\nSalary: "+salary+"\nDate of joining: "+d1.year+"-"+d1.month+"-"+d1.day+"\nOffice Hours: "+officehoursstart+"pm to "+officehoursend+"pm\nRank:"+ rank);
	}
}
