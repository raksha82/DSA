package Two_Pointerr;

public class Container_With_MostWater {
	
	public static void main(String[] args) {
		
		int height[]= {1,8,6,2,5,4,8,3,7};
		int sol=Solution(height);
		System.out.println("Area with Most Water:"+sol);
	}
	
	static int Solution(int[] height)
	{
		int start=0;
		int end=height.length-1;
		int max_area=0;
		
		while(start<end)
		{
			int area= Math.min(height[start], height[end])*(end-start);
			max_area=Math.max(max_area, area);
			
			if(height[start]<height[end])
			{
				start++;
			}
			
			else
			{
				end--;
			}
		}
		
		return max_area;
	}

}
