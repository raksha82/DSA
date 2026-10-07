package Array;

public class EvenOdd {
	public static void main(String[] args) {
		
		int a[]= {2, 7, 4, 9, 6};
		int even=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] %2==0)
			{
				even++;
			}
			
			else
			{
				odd++;
			}
		}
		
		System.out.println("Even:"+even+" \nOdd:"+odd +"\n");
		
		int even1=0,odd1=0;
		
		for(int val:a)
		{
			if(val%2==0)
			{
				even1++;
			}
			
			else
			{
				odd1++;
			}
		}
		
		System.out.println("Even:"+even1+"\nOdd:"+odd1);
	}

}
