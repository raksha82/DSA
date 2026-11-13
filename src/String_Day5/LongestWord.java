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
		
		int[] a=new int[count];
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
		
		a[a.length-1]=val;
		
		
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
		
		
		int index=-1;
		int start=-1;
		
		for(int i=0;i<s.length();i++)
		{
			start++;
			
			if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' ' ))
			{
				index++;
				
				
			}
			
			else if(index == find) {
				break;
			}
			
		}
		
		String result="";
		
		for(int i=start-1;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				break;
			}
			
			else
			{
				result += s.charAt(i);
			}
		}
		
		
		System.out.println("Longest word in the Sentence:"+result);
		System.out.println("Length of the word:"+a[index]);
		
		
	}

}
