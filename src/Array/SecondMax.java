package Array;

public class SecondMax {
	public static void main(String[] args) {
		
		int a[] = {2, 7, 4, 9, 6};
		
		int max=Integer.MIN_VALUE;
		int s_max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				s_max=max;
				max=a[i];
			}
			
			else
			{
				if(a[i]>s_max && a[i]!=max)
				{
					s_max=a[i];
				}
			}
		}
		
		System.out.println("Maximum:"+max);
		System.out.println("Second Maximum:"+s_max);
	}

}
