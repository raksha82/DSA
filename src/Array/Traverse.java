package Array;

public class Traverse {
	public static void main(String[] args) {
		
		int a[]= {2,7,4,9,6};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+1 +" Element is "+a[i]);
		}
		
		for(int value:a)
		{
			System.out.println(value);
		}
	}
	

}
