/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package PersonInheritance;
import java.util.Scanner;

public class Person {
	public String name;
	public String address;
	public String phonenumber;
	public String emailid;
	
	public Person(){
		name = "John Doe";
		address = "221/C Town Hall Street";
		phonenumber = "9841321949";
		emailid = "johndoe@abcxyz.com";
	}
	
	public void setPerson(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		this.name = input.nextLine();
		System.out.print("Enter address: ");
		this.address = input.nextLine();
		System.out.print("Enter phone number: ");
		this.phonenumber = input.nextLine();
		System.out.print("Enter email: ");
		this.emailid = input.nextLine();
	}
	
	public String toString(){
		return ("Name: "+name+"\n"+"Address: "+address+"\n"+"Phone number: "+phonenumber+"\n"+"Email id: "+emailid);
	}
}
