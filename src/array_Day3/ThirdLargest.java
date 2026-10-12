package array_Day3;

public class ThirdLargest {
	
	public static void main(String[] args) {
		
		int[] a= {7,7,7,7};
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		boolean isthird=false;
		
		for(int i=0;i<a.length;i++)
		{
			
			if (a[i] == first || a[i] == second || a[i] == third) {
			    continue;
			}
			
			else
			{
				
			
			if(a[i]>first)
			{
				third=second;
				second=first;
				first=a[i];
				
			}
			
			else
			{
			    if(a[i] != first && a[i]>second)
			    {
			    	third=second;
			    	second=a[i];
			    }
			    
			    else
			    {
			    	if(a[i]!=second && a[i]>third)
			    	{
			    		third=a[i];
			    		isthird=true;
			    	}
			    	
			    }
			}
			}
		}
		
		System.out.println("first:"+first);
		
		System.out.println("Second:"+second);
		
		if(isthird)
		{
			System.out.println("Third:"+third);
		}
		
		else
		{
			System.out.println("Third:-1");
		}
}
	
}
