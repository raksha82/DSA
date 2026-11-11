package String_Day4;

import java.util.Arrays;

public class Minimum_Occuring {
	
public static void main(String[] args) {
		
		String a="programming";
		
		boolean[] ab=new boolean[a.length()];
		int min=Integer.MAX_VALUE;
		char min_char=' ';
		
		for(int i=0;i<a.length();i++)
		{
			if(ab[i])
			{
				continue;
			}
			
			int count=0;
			for(int j=0;j<a.length();j++)
			{
				
				if(a.charAt(i) == a.charAt(j))
				{
					count++;
					ab[j]=true;
				}
			}
			
			
			if(count<min)
			{
				min=count;
				min_char=a.charAt(i);
			}
			
		}
		
		System.out.println("Minimum Frequency Letter:"+min_char+"\nFrequency:"+min);
		
	}

}
