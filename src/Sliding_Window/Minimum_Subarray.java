package Sliding_Window;

public class Minimum_Subarray {

	public static void main(String[] args) {
		int[] a= {4,2,1,7,8,1,2,8};
		int n=a.length;
		int k=3;
		int result=Solution(a,n,k);
		System.out.println(result);
	}
	
	static int Solution(int[] a, int n , int k)
	{
        //First window
		int windowsum=0;
		for(int i=0;i<k;i++)
		{
			windowsum += a[i];
		}
		
		int min=windowsum;
		
		
		for(int i=k;i<n;i++)
		{
			windowsum += a[i] - a[i-k];
			min=Math.min(min, windowsum);
		}
		
		
		return min;
	}
}
