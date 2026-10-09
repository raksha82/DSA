package array_day_2;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	public static void main(String[] args) {
		
		int[] a= {0,1,0,3,12};
		
		System.out.println("Array:"+Arrays.toString(a));
		
		int start=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[start]=a[i];
				start++;
			}
		}
		
		for(int i=start;i<a.length;i++)
		{
			a[i]=0;
		}
		
		System.out.println("Move Zeros to End:"+Arrays.toString(a));
	}

}
