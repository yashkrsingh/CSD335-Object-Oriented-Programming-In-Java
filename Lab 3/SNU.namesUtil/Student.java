/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
*/

package SNU.namesUtil;
import java.util.Scanner;

public class Student {
	public Names studentname = new Names();
	public Names fathername = new Names();
	public Names mothername = new Names();
	public int matched=0;
	
	public Student(){
		this.studentname.firstname = "John";
		this.studentname.middlename = "";
		this.studentname.lastname = "Doe";
		this.fathername.firstname = "Joe";
		this.fathername.middlename = "William";
		this.fathername.lastname = "Doe";
		this.mothername.firstname = "Mary";
		this.mothername.middlename = "";
		this.mothername.lastname = "Doe";
	}
	
	public Student(String f1, String m1, String l1, String f2, String m2, String l2, String f3, String m3, String l3){
		this.studentname.firstname = f1;
		this.studentname.middlename = m1;
		this.studentname.lastname = l1;
		this.fathername.firstname = f2;
		this.fathername.middlename = m2;
		this.fathername.lastname = l2;
		this.mothername.firstname = f3;
		this.mothername.middlename = m3;
		this.mothername.lastname = l3;
	}
	
	public void setStudentname(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student's firstname: ");
		this.studentname.firstname = input.nextLine();
		System.out.print("Enter student's middlename: ");
		this.studentname.middlename = input.nextLine();
		System.out.print("Enter student's lastname: ");
		this.studentname.lastname = input.nextLine();
	}
	
	public void setFathername(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter father's firstname: ");
		this.fathername.firstname = input.nextLine();
		System.out.print("Enter father's middlename: ");
		this.fathername.middlename = input.nextLine();
		System.out.print("Enter father's lastname: ");
		this.fathername.lastname = input.nextLine();
	}
	
	public void setMothername(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mother's firstname: ");
		this.mothername.firstname = input.nextLine();
		System.out.print("Enter mother's middlename: ");
		this.mothername.middlename = input.nextLine();
		System.out.print("Enter mother's lastname: ");
		this.mothername.lastname = input.nextLine();
	}
	
	public String getStudentFirstname(){
		return this.studentname.firstname;
	}
	
	public String getStudentMiddlename(){
		return this.studentname.middlename;
	}
	
	public String getStudentLastname(){
		return this.studentname.lastname;
	}
	
	public String getFatherFirstname(){
		return this.fathername.firstname;
	}
	
	public String getFatherMiddlename(){
		return this.fathername.middlename;
	}
	
	public String getFatherLastname(){
		return this.fathername.lastname;
	}
	
	public String getMotherFirstname(){
		return this.mothername.firstname;
	}
	
	public String getMotherMiddlename(){
		return this.mothername.middlename;
	}
	
	public String getMotherLastname(){
		return this.mothername.lastname;
	}
	
	public void displayStudentFullname(){
		System.out.print("Full Name: "+this.studentname.firstname+" "+this.studentname.middlename+" "+this.studentname.lastname);
	}
	
	public void displayStudentInitials(){
		System.out.print("Initials: "+this.studentname.firstname.charAt(0)+this.studentname.middlename.charAt(0)+this.studentname.lastname.charAt(0));
	}
	
	public void displayFatherFullname(){
		System.out.print("Full Name: "+this.fathername.firstname+" "+this.fathername.middlename+" "+this.fathername.lastname);
	}
	
	public void displayFatherInitials(){
		System.out.print("Initials: "+this.fathername.firstname.charAt(0)+this.fathername.middlename.charAt(0)+this.fathername.lastname.charAt(0));
	}
	
	public void displayMotherFullname(){
		System.out.print("Full Name: "+this.mothername.firstname+" "+this.mothername.middlename+" "+this.mothername.lastname);
	}
	
	public void displayMotherInitials(){
		System.out.print("Initials: "+this.mothername.firstname.charAt(0)+this.mothername.middlename.charAt(0)+this.mothername.lastname.charAt(0));
	}
	
}
