package MyJavaCode;
import java.util.Scanner;
public class Solving_Einstein_Therory_E_Equalto_mc2 {
public static void main(String[] args) {
	double E,M,C;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the Mass of a equation: ");
	M = scan.nextDouble();
	double C1 = Math.pow(10.00,8 );
	C = 3*C1;
	E = M*(C*C);
	System.out.println("The result of E = MC2 is : "  + E);
}
}
