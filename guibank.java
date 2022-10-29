package MyJavaCode;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class guibank {
public static void main(String[] args) throws InterruptedException {
	String Welcome = "Welcome to Gui bank glad to have custmer like you...... ";
	Print(Welcome);
	System.out.println();
	Acount  Acc = new Acount();
	Acc.Register();
	
}

public static void Print (String PrintStatement) throws InterruptedException {
	int count = PrintStatement.length();
	System.out.println();
	System.out.print("\t\t\t");
for(int i = 0;i<count;i++)
{
	System.out.print(PrintStatement.charAt(i));
	Thread.sleep(150);
}
}
}
class Acount{
	public void Register() {
		String UserName ;
		Scanner scan = new Scanner(System.in);
		ArrayList <String>Acounts = new ArrayList<String>();
		ArrayList <Integer>Passwords = new ArrayList<Integer>();
		System.out.println("Enter the User name / Acount holder Name: ");
		 UserName = scan.nextLine();
    	System.out.println("Enter the password:");
		int PassWord = scan.nextInt();
		Acounts.add(UserName);
		Passwords.add(PassWord);
		System.out.println(Acounts);
		System.out.println(Passwords);
		if(Acounts.contains(UserName) && Passwords.contains(PassWord))
		{
			System.out.println("welcome to bank");
		}
		else
		{
			System.out.println("Enter the valid Password.");
		}
	}
}
