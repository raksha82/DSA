package array_day4;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 20, 40};
		int target=20;
		
		int start=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != target)
			{
				a[start]=a[i];
				start++;
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(a, start)));
	}
}
