package array_day_2;

import java.util.Arrays;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		int[] arr= {1,1,2,2,3,4,4,5};
		
		int start=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[start]!=arr[i])
			{
				arr[start+1]=arr[i];
				start++;
			}
				
		}
		
		for(int i=start+1;i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
