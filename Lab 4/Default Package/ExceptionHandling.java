/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Exception Handling L4
*/

import SNU.geometryUtil.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			Triangle t1 = new Triangle(1,2,3);
			t1.setDimensions();
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
			System.exit(1);
		}
		System.out.print("\nNo exception encountered");	
	}

}
