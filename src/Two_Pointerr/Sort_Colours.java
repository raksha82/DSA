package Two_Pointerr;

import java.util.Arrays;

public class Sort_Colours {

	public static void main(String[] args) {
		int nums[]= {2,0,2,1,1,0};
		int sol[]=Solution(nums);
		System.out.println("Sort Colours:"+Arrays.toString(sol));
	}
	
	static int[] Solution(int nums[])
	{
		int start=0;
		int end=nums.length-1;
		int mid=0;
		
		while(mid<=end)
		{
			if(nums[mid]==0)
			{
				int temp=nums[mid];
				nums[mid]=nums[start];
				nums[start]=temp;
				
				start++;
				mid++;
			}
			
			else if(nums[mid]==2)
			{
				int temp=nums[mid];
				nums[mid]=nums[end];
				nums[end]=temp;
				
				end--;
			}
			
			else
			{
				mid++;
			}
			
		}
		
		return nums;
	}
}
