/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.namesUtil;
import java.util.Scanner;

public class Names{
	public String firstname;
	public String middlename;
	public String lastname;
	
	public Names(){
		this.firstname = "John";
		this.middlename = "";
		this.lastname = "Doe";
	}
	
	public Names(String a, String b, String c){
		this.firstname = a;
		this.middlename = b;
		this.lastname = c;
	}
	
	public void setFirstname(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstname = input.nextLine();
	}
	
	public void setMiddlename(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter middle name: ");
		this.middlename = input.nextLine();
	}
	
	public void setLastname(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter last name: ");
		this.lastname = input.nextLine();
	}
	
	public String getFirstname(){
		return firstname;
	}
	
	public String getMiddlename(){
		return middlename;
	}
	
	public String getLastname(){
		return lastname;
	}
	
	public void displayFullname(){
		System.out.print("Full Name: "+firstname+" "+middlename+" "+lastname);
	}
	
	public void displayInitials(){
		System.out.print("Initials: "+this.firstname.charAt(0)+this.middlename.charAt(0)+this.lastname.charAt(0));
	}
	
	public int sameNames(Names n1){
		if(this.firstname.equalsIgnoreCase(n1.firstname) && this.middlename.equalsIgnoreCase(n1.middlename) && this.lastname.equalsIgnoreCase(n1.lastname)){
			return 1;
		}
		else
			return 0;
	}
	
	public int sameInitials(Names n1){
		if(this.firstname.charAt(0)==n1.firstname.charAt(0) && this.middlename.charAt(0)==n1.middlename.charAt(0) && this.lastname.charAt(0)==n1.lastname.charAt(0)){
			return 1;
		}
		else
			return 0;
	}
	
	public int similarNames(Names n1){
		if(this.firstname.equalsIgnoreCase(n1.middlename) || this.firstname.equalsIgnoreCase(n1.lastname) || this.middlename.equalsIgnoreCase(n1.firstname) || this.middlename.equalsIgnoreCase(n1.lastname) || this.lastname.equalsIgnoreCase(n1.firstname) || this.lastname.equalsIgnoreCase(n1.middlename)){
			return 1;
		}
		else
			return 0;
	}
	
}
