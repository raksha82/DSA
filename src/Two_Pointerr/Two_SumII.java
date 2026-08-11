package Two_Pointerr;

import java.util.Arrays;

public class Two_SumII {
	
	public static void main(String[] args) {
		
		int a[]= {2,7,11,15};
		int target=9;
		int sol[]=Solution(a,target);
		System.out.println("Output:"+Arrays.toString(sol));
		
	}
	
	public static int[] Solution(int nums[],int target)
	{
		int start=0;
		int end=nums.length-1;
		
		while(start<end)
		{
			int sum=nums[start]+nums[end];
			
			if(sum==target)
			{
				return new int[] {start+1 , end+1};
			}
			
			else if(sum<target)
			{
				start++;
			}
			
			else
			{
				end--;
			}
		}
		
		return new int[] {-1,-1};
	}

}


