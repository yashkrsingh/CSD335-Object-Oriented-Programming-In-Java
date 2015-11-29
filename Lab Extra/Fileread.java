/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Reading from file LE 
*/

import java.io.*;

public class Fileread {
	static String genome = new String();
	public static void main(String[] args) {
		if(args.length!=1){
			System.err.println("Enter filename as a cmd parameter ");
			System.exit(1);
		}
		else{
			try{
				FileInputStream fin = new FileInputStream("/home/yash/"+args[0]);  
				BufferedReader br = new BufferedReader(new InputStreamReader(fin));  
				while((genome = br.readLine()) != null){ 
					System.out.println ("\n"+genome);
					boolean found = false;
					int start = -1;
					System.out.println("Genome associated with read line: ");
					for(int i = 0; i < genome.length() - 2; i++){
						String triplet = genome.substring(i, i + 3);
						if (triplet.equals("ATG")){
								start = i + 3;
							}
							else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA")) || (triplet.equals("ATG"))) &&
							(start != -1)){
								String gene = genome.substring(start, i);
							if (gene.length() % 3 == 0){
								found = true;
								System.out.println(gene);
								start = -1;
							}
						}
					}
				} 
				br.close();  
			    }
			 catch(Exception e){System.out.println(e);}  
		}
	}  	
}



