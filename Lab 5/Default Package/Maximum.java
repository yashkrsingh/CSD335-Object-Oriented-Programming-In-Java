/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Comparable Interface L5
*/

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

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
	
	public static void main(String[] args) throws ParseException {
		String[] stringarr = {"wacsd","was","waasdsdfasdf","rtyrty","sdfsdf","dfgsdfgsdf","fg","yhasdkfjhasdfkjhsadfkasd","sdfg","wretwertvzxcvb"};
		Integer[] intarr = {3,4,5,1,6,8,9,4,1,0};
		String[] date = {"14/05/1995","12/12/1995","16/03/1997","05/08/1995","27/04/1987","04/06/2006","09/11/2011","08/08/2000","02/10/1843","09/09/2009"};
		Date[] datearr = new Date[10];
		
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		for(int i=0;i<10;i++){
		datearr[i] = f.parse(date[i]);
		}
		
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
		
		System.out.print("\nDisplaying Date Array contents: \n");
		for(int i=0;i<datearr.length;i++){
			System.out.print(datearr[i]+"\n");
		}
		System.out.print("Maximum date (Most recent): "+findMaximum(datearr)+"\n");
		
	}

}
