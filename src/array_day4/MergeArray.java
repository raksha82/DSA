package array_day4;

import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int[] a = {1, 3, 5};
		int[] b = {7, 8, 9};
		
		int[] result= new int [a.length+b.length];
		int m=0,n=0;
		
		for(int i=0;i<result.length;i++)
		{
			if(m==a.length && n<b.length)
			{
				result[i]=b[n];
				n++;
			}
			
			else if(n==b.length && m<a.length)
			{
				result[i]=a[m];
				m++;
			}
			
			
			else if(a[m]<b[n])
			{
				result[i]=a[m];
				m++;
			}
			
			else 
			{
				result[i]=b[n];
				n++;
			}
			
		
			
			
			
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
