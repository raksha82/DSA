package Two_Pointerr;

import java.util.Arrays;

public class Remove_element {
	
	public static void main(String[] args) {
		int nums[]= {3,2,2,3};
		int value=3;
		int sol=Solution(nums,value);
		for(int i=sol;i<nums.length;i++)
		{
			nums[i]=-1;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static int Solution(int[] nums,int value) 
	{
		int start=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != value)
			{
				nums[start]=nums[i];
				start++;
			}
		}
		
		return start;
	}

}
