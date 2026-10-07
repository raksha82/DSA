package Sliding_Window;

import java.util.Arrays;

public class FirstNegativeNumberSubArray {
	public static void main(String[] args) {
		
		int a[]= {12, -1, -7, 8, -15, 30, 16, 28};
		int k=3;
		int[] result=Solution(a,k);
		System.out.println(Arrays.toString(result));
	}
	
	static int[] Solution(int[] a, int k)
	{
		int first=0;
		int sol[]=new int[a.length-k+1];
		for(int i=0;i<k;i++)
		{
			if(a[i]<0)
			{
				sol[first++]=a[i];
				break;
			}
		}
		
		System.out.println(Arrays.toString(sol));
		for(int i=1;i<a.length-k;i++)
		{
		   for(int j=i;j<i+k;j++)
		   {
			   if(a[j]<0)
			   {
				  sol[first++]=a[j];
				  System.out.println(Arrays.toString(sol));
				  break;
			   } 
		   }
		}
		return sol;
	}

}
