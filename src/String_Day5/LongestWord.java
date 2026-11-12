package String_Day5;

import java.util.Arrays;

public class LongestWord {
	
	public static void main(String[] args) {
		
		String s="Java is a Programming Language";
        int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' ' ))
			{
				count++;
				
			}
		}
		
		int[] a=new int[count-1];
		int val=0;
		int j=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				val++;
			}
			
			else
			{
				a[j]=val;
				j++;
				val=0;
			}
			
		}
		
		int max=0;
		int find=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				find=i;
			}
		}
		
		String[] s1=s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++)
		{
			if(i == find)
			{
				System.out.println("Longest Word:"+s1[i]);
			}
		}
		
		
	}

}
