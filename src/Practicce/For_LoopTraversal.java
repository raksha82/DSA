package Practicce;

public class For_LoopTraversal {
	
	public static void main(String[] args) {
		
		int[] a= {10,90,56,78,82,22,45,23};
		
		System.out.println("Traversing the Array using for loop");
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element no "+ (i+1) + " is :"+a[i]);
			System.out.println();
		}
	}

}
