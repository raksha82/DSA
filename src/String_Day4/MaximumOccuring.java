package String_Day4;

import java.util.Arrays;

public class MaximumOccuring {
	
	public static void main(String[] args) {
		
		String a="programming";
		
		boolean[] ab=new boolean[a.length()];
		int[] counting=new int[a.length()];
		
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
			
			counting[i]=count;
			
		}
		
		int max=0;
		
		for(int i=0;i<counting.length;i++)
		{
			if(max<counting[i])
			{
				max=counting[i];
			}
		}
		
		for(int i=0;i<counting.length;i++)
		{
			if(counting[i]==max)
			{
				System.out.println("Maximum occurring character:"+a.charAt(i));
				System.out.println("Frequency:"+counting[i]);
				break;
			}
		}
		
	}

}
