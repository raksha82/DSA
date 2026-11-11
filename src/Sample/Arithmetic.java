package Sample;
import java.util.*;

public class Arithmetic {
	
	static Scanner sc= new Scanner(System.in);
			

	public static void main(String[] args) {
		
		
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		
		
		System.out.println("Enter the mark:");
		double mark=sc.nextDouble();
		
		
		System.out.println("Student Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Mark:"+mark);
		
		
		
		int a=100 , b=20;
		
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction"+(a-b));
		System.out.println("Multiply:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Modulo:"+(a%b));  //It gives the reminder
		
	}
}
