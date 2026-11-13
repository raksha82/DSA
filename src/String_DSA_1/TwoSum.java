package String_DSA_1;

public class TwoSum {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 6, 8, 9};
		int target = 10;
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int sum=arr[start]+arr[end];
			
			if(target==sum)
			{
				System.out.println("Pair Found:"+arr[start]+" , "+arr[end]);
				start++;
				end--;
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
