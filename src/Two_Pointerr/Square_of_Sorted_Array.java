package Two_Pointerr;

import java.util.Arrays;

public class Square_of_Sorted_Array {
	
	public static void main(String[] args) {
		
		int nums[]= {-4,-1,0,3,10};
		int[] sol=Solution(nums);
		System.out.println("Given Array:"+Arrays.toString(nums));
		System.out.println("Square of Sorted Array:"+Arrays.toString(sol));
	}
	
   static int[] Solution(int nums[])
   {
	   
	   int[] solution=new int[nums.length];
	   int index=nums.length-1;
	   int start=0;
	   int end=nums.length-1;
	   
	   while(start<=end)
	   {
		   if(Math.abs(nums[start])<Math.abs(nums[end]))
		   {
			   solution[index]=nums[end]*nums[end];
			   end--;
		   }
		   
		   else
		   {
			   solution[index]=nums[start]*nums[start];  
			   start++;
		   }
		   
		   index--;
		   
	   }
	return solution;
	   
   }

}
