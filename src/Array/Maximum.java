package Array;

public class Maximum {

	public static void main(String[] args) {
		int a[]= {2, 7, 4, 9, 6};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Max Value:"+max);
		
		int max2=Integer.MIN_VALUE;
		
		for(int val:a)
		{
			if(val>max2)
			{
				max2=val;
			}
		}
		
		System.out.println("Max Value:"+max2);
	}
}
