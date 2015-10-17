/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Lottery L1 
*/

import java.util.Scanner;
import java.lang.Math;

public class lottery{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int lotuser,lottick;
		int user1,user2;
		int tick1,tick2;
		lottick = (int)(Math.random() * 100);
		tick1 = lottick%10;
		tick2 = lottick/10;	
		System.out.println("winning number " +lottick);
		System.out.println("Enter your lottery ticket number");
		lotuser = input.nextInt();
		user1 = lotuser%10;
		user2 = lotuser/10;
		if(lottick==lotuser){
			System.out.println("You win!!!!!\nYour prize: 10000$");
		}
		else if(tick1==user2&&tick2==user1){
			System.out.println("You win!!!!!\nYour prize: 3000$");
		}
		else if((tick1==user1||tick1==user2)||(tick2==user1||tick2==user2)){
			System.out.println("You win!!!!!\nYour prize: 1000$");
		}
	}
}
