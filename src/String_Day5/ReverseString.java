package String_Day5;

import java.util.Arrays;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Java is Easy";
		
		String[] s1=s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			char[] a=s1[i].toCharArray();
			int start=0;
			int end=a.length-1;
			
			while(start<end)
			{
				char temp=a[start];
				a[start]=a[end];
				a[end] = temp;
				
				start++;
				end--;
			}
			
			
		  s1[i]=new String(a);
		}
		
		String result = String.join(" ", s1);
	
		System.out.println(result); 
		
	}

}
