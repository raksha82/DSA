package array_day4;

import java.util.Arrays;

public class IntersectionArrayElements {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 2, 3};
		int[] b = {2, 2, 4};
		
		
		int[] result= new int[a.length];
		int start=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					if(a[i]==b[j])
					{
					for(int k=0;k<result.length;k++)
					{
					   if(a[i]==result[k])
						   break;
					}
					}
					
					else
					{
						result[start]=a[i];
						start++;
					}
					
					
				}
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(result, start)));
	}
}
