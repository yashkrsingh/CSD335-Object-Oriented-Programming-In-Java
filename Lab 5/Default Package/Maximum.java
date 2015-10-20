/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Comparable Interface L5
*/

import java.util.Scanner;

public class Maximum {
	
	public static Object findMaximum(Comparable[] arr){
		Comparable max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max.compareTo(arr[i]) < 0){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		String[] stringarr = {"wacsd","was","waasdsdfasdf","rtyrty","sdfsdf","dfgsdfgsdf","fg","yhasdkfjhasdfkjhsadfkasd","sdfg","wretwertvzxcvb"};
		Integer[] intarr = {3,4,5,1,6,8,9,4,1,0};
		java.util.Date[] datearr= {09/03/1996};
		
		System.out.print("Displaying String Array contents: \n");
		for(int i=0;i<stringarr.length;i++){
			System.out.print(stringarr[i]+"\n");
		}
		System.out.print("Maximum String (Lexicographically): "+findMaximum(stringarr)+"\n");
		
		System.out.print("\nDisplaying Integer Array contents: \n");
		for(int i=0;i<intarr.length;i++){
			System.out.print(intarr[i]+"\n");
		}
		System.out.print("Maximum integer: "+findMaximum(intarr)+"\n");
		
	}

}
