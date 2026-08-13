package Two_Pointerr;

public class Valid_Palindrome {
	
	public static void main(String[] args) {
		
		String s="Madam";
		boolean sol=Solution(s);
	}

	static boolean Solution(String s)
	{
	   int start=0;
	   int end=s.length()-1;
	   boolean isvalid=true;
	   while(start<end)
	   {
	       if(s.charAt(start)==s.charAt(end))
	       {
	    	   start++;
	    	   end--;
	       }
	   }
		
		return s;
	}
}
