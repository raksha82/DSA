package Array;

public class Sum {
	
	public static void main(String[] args) {
		int a[]= {2, 7, 4, 9, 6};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum +=a[i];
		}
		
		System.out.println("Sum:"+sum);
		
		int sum2=0;
		for(int val:a)
		{
			sum2 +=val;
		}
		
		System.out.println("Sum:"+sum2);
	}

}
