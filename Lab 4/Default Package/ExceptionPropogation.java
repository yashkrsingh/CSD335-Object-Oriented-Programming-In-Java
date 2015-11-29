/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Exception Propogation L4
*/

public class ExceptionPropogation {
	
	public static void method1() throws Exception {
		try {
		method2();
		}
		catch (Exception ex) {
		throw new Exception("Information from method1", ex);
		}
	}
	
	public static void method2() throws Exception {
		throw new Exception("Information from method2");
	}
	
	public static void main(String[] args) {
		try {
		method1();
		}
		catch (Exception ex) {
		ex.printStackTrace();
		}
	}
}
