package array_day_2;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,4};
		int target=9;
		
		System.out.println("Array:"+Arrays.toString(a));
		
		int start=0;
		int end=a.length-1;
		
		while(start<end)
		{
			int sum=a[start]+a[end];
			
			if(sum==target)
			{
				int arr[]= {start , end};
				
				System.out.println("Indices:"+Arrays.toString(arr));
				break;
			}
			
			else if(target>sum)
			{
				start++;
			}
			
			else
			{
				end--;
			}
			
		}
	}

}
