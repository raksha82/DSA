package Practicce;

public class Return_Without_Value {
	
	public static void main(String[] args) {
		
		System.out.println("Return without a Value");
		add(10,20);
	}

	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of a and b :"+c);
		return;
        // System.out.println("Completed");
	}
	
}
