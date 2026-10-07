package Array;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int a[] = {2, 7, 4, 9, 6};
		int target = 9;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println("Element Found at "+i+" index");
			}
		}
	}

}
