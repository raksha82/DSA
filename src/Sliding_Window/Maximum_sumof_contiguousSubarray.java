package Sliding_Window;

public class Maximum_sumof_contiguousSubarray {
	public static void main(String[] args) {
		
		int[] a= {2,1,5,1,3,2};
		int k=3;
		int result=Solution(a, k);
		System.out.println(result);
	}
	
	static int Solution(int[] a, int k)
	{
		int currentsum=0;
		for(int i=0;i<k;i++)
		{
			currentsum += a[i];
		}
		
		int max=currentsum;
		
		for(int i=k;i<a.length;i++)
		{
			currentsum += a[i] - a[i-k];
			max=Math.max(max, currentsum);
		}
		
		
		return max;
	}

}
