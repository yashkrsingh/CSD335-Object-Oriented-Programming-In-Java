/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package PersonInheritance;
import java.util.Scanner;

public class Employee extends Person{
	public String office;
	public int salary;
	public Mydate d1 = new Mydate();
	
	public Employee(){
		office = "Borivali East";
		salary = 18899;
		d1.year = 2012;
		d1.month = 9;
		d1.day = 12;
	}
	
	public void setEmployee(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter office: ");
		this.office = input.nextLine();
		System.out.print("Enter salary: ");
		this.salary = input.nextInt();
		System.out.print("Enter date (dd/mm/yyyy): ");
		String date = input.nextLine();
		String[] tokens = date.split("[./-]");
		this.d1.day = Integer.parseInt(tokens[0]);
		this.d1.month = Integer.parseInt(tokens[1]);
		this.d1.year = Integer.parseInt(tokens[2]);
	}
	
	public String toString(){
		return ("Name: "+name+"\n"+"Address: "+address+"\n"+"Phone number: "+phonenumber+"\n"+"Email id: "+emailid+"\nOffice: "+office+"\nSalary: "+salary+"\nDate of joining: "+d1.year+"-"+d1.month+"-"+d1.day);
	}
}
