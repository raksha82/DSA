package String_Day5;

import java.util.Arrays;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Java is Easy";
		
		char[] ss=s.toCharArray();
		
		int start=0;
		int end=ss.length-1;
		
		while(start<end)
		{
			char temp=ss[start];
			ss[start]=ss[end];
			ss[end] = temp;
			
			start++;
			end--;
		}
		
	    String n=new String(ss);
	    System.out.println(n);
		
		
		
		
	}

}
