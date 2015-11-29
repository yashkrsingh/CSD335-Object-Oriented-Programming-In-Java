/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
	Program Title: JCF L7
*/

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

class Tokenize{
	
    private int value = 0;
    private String name, tokenString;
    BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
    StringTokenizer tokens;

    Tokenize(){
    	tokenString = JOptionPane.showInputDialog("Enter infix Expression: ");
        tokens = new StringTokenizer (tokenString, "+-*/() ", true);
    } 

    public void getToken(){
        char ch = ' ';
        if (tokens.hasMoreTokens ()){
            String token = tokens.nextToken ();
            ch = token.charAt (0);
            while (ch == ' '){
                token = tokens.nextToken ();
                ch = token.charAt (0);
            }
            if (('0' <= ch) && (ch <= '9')){
                name = "digit";
                try{ value = Integer.parseInt(token);
                } catch (NumberFormatException e) {value = 0;}
            }
            else{    
            	switch (ch){
                case '+': name = "plus"; break;
                case '-': name = "minus"; break;
                case '*': name = "times"; break;
                case '/': name = "divide"; break;
                case '(': name = "lparen"; break;
                case ')': name = "rparen"; break;
                default: name = "other";
            	}
            }
        }
        else name = "other";
    }

    public String getName () { return name; }
    public int getValue () { return value; }

}

class Expression{
    private Tokenize token;

    Expression (Tokenize token){ 
    	this.token = token; 
    }

    public int expression(){
        String oper;
        int result;
        result = term ();
        while ((token.getName ().equals ("plus")) || (token.getName ().equals ("minus"))){
            oper = token.getName ();
            token.getToken ();
            if (oper.equals ("plus")){
                result = result + term ();
            }
            else{
                result = result - term ();
            }
        }
        return result;
    }
    
    public int term (){
        String oper;
        int result;
        result = factor ();
        while ((token.getName ().equals ("times")) || (token.getName ().equals ("divide"))){
            oper = token.getName ();
            token.getToken ();
            if (oper.equals ("times")){
                result = result * factor ();
            }
            else{
                result = result / factor ();
            }
        }
        return result;
    }

    public int factor (){
        int result = 0;
        if (token.getName ().equals ("digit")){
            result = token.getValue ();
            token.getToken ();
        }
        else{
	        if(token.getName ().equals ("lparen")){
	            token.getToken ();
	            result = expression ();
	            if (token.getName ().equals ("rparen"))
	                token.getToken ();
	            else
	                System.out.print ("Error: missing right paren");
	        }
	        else
	            System.out.print ("Error: invalid token");
        }
        return result;
    } 
}

public class JCF2{
    
	public static void main(String [] args){
		Tokenize token = new Tokenize();
		token.getToken();
		Expression express = new Expression(token);
		JOptionPane.showMessageDialog(null, express.expression());
    }
} 
