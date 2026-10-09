package array_day_2;

import java.util.Arrays;

public class Missing_Number {
	
	public static void main(String[] args) {
		int a[]= {3,0,1};
		
		int n=a.length;
		
		int sum = (n*(n+1))/2;
		
		int total=0;
		
		for(int i=0;i<a.length;i++)
		{
			total += a[i];
		}
		
		int missing_number= sum-total;
		
		System.out.println("Array:"+Arrays.toString(a));
		System.out.println("Missing Number:"+missing_number);
	}

}
