package Two_Pointerr;

import java.util.Arrays;

public class Move_Zeros {
	
	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		int sol=Solution(nums);
//		for(int i=sol;i<nums.length;i++)
//		{
//			nums[i]=0;
//		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static int Solution(int[] nums) 
	{
		int start=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != 0)
			{
			    int temp = nums[start];
			    nums[start] = nums[i];
			    nums[i] = temp;
			    start++;
			}
		}
		
		return start;
	}


}
