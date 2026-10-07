package Array;

public class Minimum {
	public static void main(String[] args) {
		int a[]= {2, 7, 4, 9, 6};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Max Value:"+min);
		
		int min2=Integer.MAX_VALUE;
		
		for(int val:a)
		{
			if(val<min2)
			{
				min2=val;
			}
		}
		
		System.out.println("Max Value:"+min2);
	}

}
