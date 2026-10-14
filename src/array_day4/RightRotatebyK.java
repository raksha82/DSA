package array_day4;

import java.util.Arrays;

public class RightRotatebyK {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int k=8;
		
		if(a.length==0)
		{
			System.out.println(Arrays.toString(a));
			return ;
		}
		
		k=k%a.length;
		
		int start=0,end=k;
		
		while(start<end)
		{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
		}
		
		int start1=k+1,end1=a.length-1;
		
		while(start1<end1)
		{
				int temp=a[start1];
				a[start1]=a[end1];
				a[end1]=temp;
				start1++;
				end1--;
		}
		
		int start2=0;
		int end2=a.length-1;
		
		while(start2<end2)
		{
				int temp=a[start2];
				a[start2]=a[end2];
				a[end2]=temp;
				start2++;
				end2--;
		}
		
		
		
		System.out.println(Arrays.toString(a));
	}

}
