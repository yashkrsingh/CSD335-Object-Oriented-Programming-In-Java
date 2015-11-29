/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
	Program Title: JCF L7
*/

import java.io.*;
import java.util.*;

public class JCF1{

	public static void main(String[] args) throws IOException {
		int a=0,e=0,i=0,o=0,u=0;
		Map<Character, Integer> vowels = new HashMap<Character, Integer>();
		FileInputStream f = new FileInputStream("/home/yash/file.txt");
		while(f.available()>0){
			if((char)f.read() == 'a')
				vowels.put((char)f.read(),a++);
			if((char)f.read() == 'e')
				vowels.put((char)f.read(),e++);
			if((char)f.read() == 'i')
				vowels.put((char)f.read(),i++);
			if((char)f.read() == 'o')
				vowels.put((char)f.read(),o++);
			if((char)f.read() == 'u')
				vowels.put((char)f.read(),u++);
		}
		
		System.out.print("\nFrequency of vowels: ");
		System.out.print("\na: "+vowels.get('a'));
		System.out.print("\ne: "+vowels.get('e'));
		System.out.print("\ni: "+vowels.get('i'));
		System.out.print("\no: "+vowels.get('o'));
		System.out.print("\nu: "+vowels.get('u'));
		
		ArrayList<String> words  = new ArrayList<>();
		Scanner input = new Scanner(new File("/home/yash/file.txt"));
		while(input.hasNext()){
			words.add(input.next());
		}
		for(int j=0;j<words.size();j++){
			if(words.get(j).equalsIgnoreCase("the")){
				words.remove(j);
				words.add(j,"THE");
			}
		}
		FileWriter writer = new FileWriter(new File("/home/yash/fileNew.txt"));
		for(int j=0;j<words.size();j++){
			writer.write(words.get(j)+" ");
		}
		writer.flush();
		writer.close();
		System.out.print("\n\n'the' replaced with 'THE'");
	}
}


