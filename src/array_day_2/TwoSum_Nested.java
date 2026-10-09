package array_day_2;

public class TwoSum_Nested {
	
	public static void main(String[] args) {
		
		int a[]= {3,2,4};
		int target=6;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j] == target)
				{
					System.out.println("Indicies:"+i+","+j);
				}
			}
		}
	}

}
