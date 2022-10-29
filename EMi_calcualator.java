package MyJavaCode;
import java.util.Scanner;
public class EMi_calcualator {
public static void main(String[] args) throws InterruptedException {
	cals();	
	System.out.println();
	EMI_calculator(14000,10);
}


public static double  EMI_calculator(double loanamount,int Duration) throws InterruptedException {
	
	double Loan_amount = loanamount;
	
	 
	Scanner scan = new Scanner (System.in);
	Thread.sleep(800);
	switch(Type_of_loan()) {
	case 1: {
		System.out.println("\u001B[37m"+"You selected : "+"\u001B[33m"+" Home loan");
		Thread.sleep(150);
		System.out.println( "\u001B[37m"+ "Intrest Rate : " + "\u001B[31m" + "14%");
		Thread.sleep(150);
		System.out.println("\u001B[37m" +  "Loan Amount : " +"\u001B[32m" + Loan_amount);
		Thread.sleep(150);
		System.out.println("\u001B[37m" + "Duration in Months : " + "\u001B[36m" + Duration*12);
		Thread.sleep(150);
		System.out.printf("\u001B[37m" + "Your Monthly instalments : " + "\u001B[34m" + "%.2f%n" , Loan_amount / (Duration * 12));
		Thread.sleep(150);
		System.out.printf("\u001B[37m" + "Your Total RePayment is : " + "\u001B[35m" +"%.2f%n", ((Loan_amount / (Duration*12)) + (Loan_amount + 1960)));
	
		}
	}
	
	
	return 0.0;
}
public static  void cals() throws InterruptedException {
	String ANSI_RESET = "\u001B[36m";
	char [] array;
	String element = "EMi Calulator   ";
	array = new char[element.length()];
	for(int i = 0;i<array.length;i++) {
		array[i] = element.charAt(i);
	}
	System.out.print("\t\t\t\t\t\t\t");
	for(int i = 0;i<array.length;i++)
	{
		Thread.sleep(300);
		System.out.print(ANSI_RESET + array[i]);
	}

System.out.println();

}
public static int  Type_of_loan() throws InterruptedException {
	String ANSI_RESET = "\u001B[32m";
	Thread.sleep(1000);
	System.out.print("\t\t\t\t\t\t");
	
	char[] array = {'W','e','l','c','o','m','e',' ','t','o',' ','j','a','v','a',' ','b','a','n','k','.'};
	for(int i =0;i<array.length;i++) {
		Thread.sleep(300);
		System.out.print(ANSI_RESET + array[i]);
	}
	System.out.print("\t\t");
	System.out.println();
	System.out.println();
	int Option;
	Scanner scan = new Scanner (System.in);
	System.out.println("\t\t\t\t" + "\u001B[31m"+ "Here option are :..." );
	System.out.println();
	System.out.println( "\u001B[35m"+"1.Home Loan" );
	Thread.sleep(800);
	System.out.println();
	System.out.println("\u001B[33m"+ "2.Person Loan");
	Thread.sleep(800);
	System.out.println();
	System.out.println("\u001B[31m"+"3.Gold loan"  );
	System.out.println();
	Thread.sleep(1000);
	System.out.println( "\u001B[34m"+ "Enter the option to Calculate: ");
	Option = scan.nextInt();
	return Option;
}


}
