package array_day4;

import java.util.Arrays;

public class IntersectionArrayElements {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {3, 4, 5, 6, 7};
		
		
		int[] result= new int[a.length];
		int start=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					result[start]=a[i];
					start++;
				}
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(result, start)));
	}
}
