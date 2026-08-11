package Two_Pointerr;

import java.util.Arrays;

public class Remove_Duplicates {
	
 public static void main(String[] args) {
	 
	 int nums[]= {0,0,1,1,1,2,2,3,3,4};
	 int sol=Solution(nums);
	 
	 for(int i=sol;i<=nums.length-1;i++)
	 {
		 nums[i]=-1;
	 }
	 
	 System.out.println(Arrays.toString(nums));
	
}
 
 public static int Solution(int nums[])
 {
	 int start=1;
	 
	 for(int i=1;i<nums.length;i++)
	 {
		 if(nums[i]!=nums[start-1])
		 {
			 nums[start]=nums[i];
			 start++;
		 }
	 }
	 
	 return start;
 }
}
