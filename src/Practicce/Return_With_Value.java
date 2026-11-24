package Practicce;

public class Return_With_Value {
	
	public static void main(String[] args) {
		
		System.out.println("Return with Value");
		int output=add(24,82);
		System.out.println("Addition of a and b :"+output);
	}

	public static int add(int a, int b)
	{
		
		return a+b;
        // System.out.println("Completed");
	}
}
