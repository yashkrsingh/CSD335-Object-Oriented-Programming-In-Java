/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Learning more about strings L4
*/

import SNU.namesUtil.*;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		int sncount=0,fncount=0,i=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		Student[] arr = new Student[n];
		for(i=0;i<n;i++){
			arr[i] = new Student();
			arr[i].setStudentname();
			arr[i].setFathername();
		}
		
		for(i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i].studentname.sameNames(arr[j].studentname)==1 && arr[i].matched==0 && arr[j].matched==0){
					sncount++;
					arr[j].matched++;
				}
			}
		}
		
		for(i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i].fathername.sameNames(arr[j].fathername)==1 && arr[i].matched==0 && arr[j].matched==0){
					fncount++;
					arr[j].matched++;
				}
			}
		}
		
		if(sncount == 0)
			System.out.print("\nNumber of same student names: "+(sncount));
		else
			System.out.print("\nNumber of same student names: "+(sncount+1));
			
		if(fncount == 0)
			System.out.print("\nNumber of same father's names: "+(fncount));
		else
			System.out.print("\nNumber of same father's names: "+(fncount+1));
	}

}
