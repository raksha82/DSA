package Array;

import java.util.Arrays;

public class Reverse {
	
	public static void main(String[] args) {
		
		int a[]= {2, 7, 4, 9, 6};
		
		System.out.println("Array:"+Arrays.toString(a));
		
		int start=0, end=a.length-1;
		
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.println("Reverse Array:"+Arrays.toString(a));
	}

}
