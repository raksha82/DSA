package Sliding_Window;

import java.util.Arrays;

//Find the average for every elements:

public class Average_Subarray {

	public static void main(String[] args) {
		
		int[] a= {1,3,2,6,-1,4,1,8,2};
		int k=5;
		int n=a.length;
		
		double[] result=Solution(a,k,n);
		System.out.println(Arrays.toString(result));
	}
	
	static double[] Solution(int[] a, int k, int n)
	{
		if(n<k)
		{
			return new double[0];
		}
		double windowsum=0;
		for(int i=0;i<k;i++)
		{
			windowsum +=a[i];
			
		}
		
		int start=0;
		double[] result=new double[n-k+1];
		result[start++]=windowsum/k;
		
		for(int i=k;i<n;i++)
		{
			windowsum += a[i] - a[i-k];
			result[start++]=windowsum/k;

		}
		return result;
	}
}
