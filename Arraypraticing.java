package MyJavaCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Arraypraticing {


public static void main(String[] args) {
	
	/*
	 * List mylist = new LinkedList(); Scanner scan = new Scanner (System.in);
	 * System.out.println("enter teh value of array:"); for(int i = 0;i<5;i++) {
	 * mylist.add(scan.next()); }
	 * 
	 * 
	 * 
	 * System.out.println(mylist); System.out.println("\u001B[31m"+mylist.get(4));
	 * mylist.remove("hibro"); System.out.println(mylist);
	 */
List <String>anotherList = new Vector<String>();
anotherList.add("hi_bro");
anotherList.add("hellomachi");

Iterator <String>iter = anotherList.iterator();
while(iter.hasNext())
{
	System.out.println(iter.next());
}

ListIterator <String> liter = anotherList.listIterator();

while(liter.hasNext())
{
	System.out.println(liter.next());
}
while(liter.hasPrevious())
{
	System.out.println(liter.previous());
}

if(anotherList.contains("hi_bro"))
{
	System.out.println("yes");
}


Scanner scan = new Scanner(System.in);

anotherList.add("rameh");
anotherList.add("suresh");
anotherList.add("mahesg");
String Username = scan.next();
if(anotherList.contains(Username))
{
	System.out.println("Welcome " + Username);
}
else
{
	System.out.println("its not valid user name");
}

if(anotherList.isEmpty()) {
	System.out.println("Its not empty!....");
}











}
}
