package String_DSA_1;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		
		String s="nurses run";
		
		int start=0;
		int end=s.length()-1;
		
		boolean isPalindrome=true;
		
		while(start<end)
		{
			if(s.charAt(start)==' ')
			{
				start++;
			}
			
			 else if (s.charAt(end) == ' ') {
			        end--;
			    }
			
			else
			{
				if(s.charAt(start) != s.charAt(end))
				{
					isPalindrome=false;
					break;
				}
			}
			
			
			
			
			
			start++;
			end--;
		}
		
		
		
		if(isPalindrome)
		{
			System.out.println(s+" is a Palindrome");
		}
		
		else
		{
			System.out.println(s+" not a Palindrome");
		}
	}

}
