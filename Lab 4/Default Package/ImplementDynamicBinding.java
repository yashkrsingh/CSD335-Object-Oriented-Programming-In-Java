/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Understanding Dynamic Binding L4
*/

import DynamicBinding.*;
public class ImplementDynamicBinding {

	public static void main(String[] args) {
		
		FirstD o1 = new FirstD();
		o1.locateClass(); 
		System.out.println();
		SecondD o2 = new SecondD();
		o2.locateClass(); 
		System.out.println();
		ThirdD o3 = new ThirdD();
		o3.locateClass();
	}

}
