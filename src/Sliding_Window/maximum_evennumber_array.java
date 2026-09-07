package Sliding_Window;

public class maximum_evennumber_array {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,4,6,8,5,10};
		int k=3;
		int result=Solution(a,k);
		System.out.println(result);
	}
	
	static int Solution(int[] a, int k)
	{
		int even=0;
		for(int i=0;i<k;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
		}
		
		int max=even;
		
		for(int i=k;i<a.length;i++)
		{
			if(a[i-k] % 2 ==0)
			{
				even--;
				
			}
			
			if(a[i] % 2==0)
			{
				even++;
			}
				
				max=Math.max(max, even);
	     }
			
		return max;
	}

}
