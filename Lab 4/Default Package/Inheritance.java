/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Understanding Overriding Methods L4
*/

import PersonInheritance.*;;

public class Inheritance {

	public static void main(String[] args) {
		String temp;
		Person p1 = new Person();
		Student s1 = new Student();
		Employee e1 = new Employee();
		Faculty f1 = new Faculty();
		Staff sf1 = new Staff();
		
		p1.setPerson();
		System.out.print("\ntoString for Person: \n");
		temp = p1.toString();
		System.out.println(temp+"\n");
		
		s1.setPerson();
		s1.setStudent();
		System.out.print("\ntoString for Student: \n");
		temp = s1.toString();
		System.out.println(temp+"\n");
		
		e1.setPerson();
		e1.setEmployee();
		System.out.print("\ntoString for Employee: \n");
		temp = e1.toString();
		System.out.println(temp+"\n");
		
		f1.setPerson();
		f1.setEmployee();
		f1.setFaculty();
		System.out.print("\ntoString for Faculty: \n");
		temp = f1.toString();
		System.out.println(temp+"\n");
		
		sf1.setPerson();
		sf1.setEmployee();
		sf1.setStaff();
		System.out.print("\ntoString for Staff: \n");
		temp = sf1.toString();
		System.out.println(temp+"\n");
	}

}
