package Two_Pointerr;

public class Valid_Palindrome {
	
	public static void main(String[] args) {
		
		String s="Madam";
		boolean sol=Solution(s);
		if(sol)
		{
			System.out.println(s+" is a Valid Palindrome");
		}
		else
		{
			System.out.println(s+" is not a Valid Palindrome");
		}
	}

	static boolean Solution(String s)
	{
	   int start=0;
	   int end=s.length()-1;
	   boolean isvalid=true;
	   while(start<end)
	   {
	       if(s.toLowerCase().charAt(start)==s.toLowerCase().charAt(end))
	       {
	    	   start++;
	    	   end--;
	       }
	       
	       else
	       {
	    	   return isvalid=false;
	       }
	   }
		
		return isvalid;
	}
}
