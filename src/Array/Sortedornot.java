package Array;

public class Sortedornot {
	
	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,9};
		boolean found=false;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				found=true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println("Array is not sorted");
		}
		
		else
		{
			System.out.println("Array is sorted");
		}
	}

}
