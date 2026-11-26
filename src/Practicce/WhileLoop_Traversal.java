package Practicce;

public class WhileLoop_Traversal {
	
	public static void main(String[] args) {
		
		int[] a= {10 , 20 , 30 , 40 , 50};
		
		int i=0;
		
		System.out.println("Array Traversal using While Loop");
		System.out.println();
		
		while(i < a.length)
		{
			System.out.println("Element no "+ (i+1) + " is :"+a[i]);
			i++;
			System.out.println();
		}
	}

}
