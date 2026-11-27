package Practicce;

public class TwoD_Traversal {
	
	public static void main(String[] args) {
		
		int[][] a= {{10 , 20, 30},
				     {11 , 22, 33},
				     {45 , 23 , 28 }};
		
		System.out.println("*********************************");
		
		System.out.println("Two Dimensional Array Traversal");
		
		System.out.println("*********************************");
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("     ");
			}
			
			System.out.println();
		}
	}

}
