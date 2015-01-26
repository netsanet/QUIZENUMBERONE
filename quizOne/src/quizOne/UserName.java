package quizOne;
import java.util.Scanner;
public class UserName {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		String username;
		String pasword;
		System.out.println("Enter your username"); 
		username = scan.next();
		System.out.println("Enter your pasword");
		pasword = scan.next();
		System.out.println( "Hello "+ username + ", welcom to CSC 200 class! and your pasword is " + pasword);
		
	}

}
