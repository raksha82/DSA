package array_Day3;

import java.util.Arrays;

public class MoveLeftby1 {
	
	public static void main(String[] args) {
		
		int a[]= {};
		
		int k=1;
		
		if (a.length <= 1) {
		    System.out.println(Arrays.toString(a));
		    return;
		}
		
		int last=a[0];
		
		
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=last;
		
		
		
		System.out.println("Array:"+Arrays.toString(a));
	}

}
