package Two_Pointerr;

import java.util.Arrays;

public class Merge_Sorted_Array {
	
	public static void main(String[] args) {
       int nums1[]= {1,2,3,0,0,0};
       int nums2[]= {2,5,6};
       
       int sol[]=Solution(nums1,nums2);
       System.out.println("Merged Array:"+Arrays.toString(sol));
	}
	
	static int[] Solution(int nums1[], int nums2[])
	{
		int i=2;
		int j=2;
		int index=nums1.length-1;
		
		while(j>=0 && i>=0)
		{
			if(nums1[i]>nums2[j])
			{
				nums1[index]=nums1[i];
				i--;
			}
			
			else
			{
				nums1[index]=nums2[j];
				j--;
			}
			
			index--;
		}
		
		while(j>=0)
		{
			nums1[index]=nums2[j];
			j--;
			index--;
			
		}
		
		
		return nums1;
	}

}
