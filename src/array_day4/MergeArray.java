package array_day4;

import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		
		int[] result= new int [a.length+b.length];
		int m=0,n=0;
		
		for(int i=0;i<result.length-1;i++)
		{
			if(a[m]==a.length && b[n]<b.length)
			{
				result[i]=b[n];
				n++;
			}
			
			else if(b[n]==b.length && a[m]<a.length)
			{
				result[i]=a[m];
				m++;
			}
			
			
			else if(a[m]<b[n])
			{
				result[i]=a[m];
				m++;
			}
			
			else if(a[m]>a[n])
			{
				result[i]=b[n];
				n++;
			}
			
			else if(a[m]==a.length)
			{
				result[i]=b[n];
				n++;
			}
			
			else
			{
				result[i]=a[m];
				m++;
			}
			
			System.out.println(Arrays.toString(result));
			
		}
		
		
	}

}
