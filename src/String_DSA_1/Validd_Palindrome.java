package String_DSA_1;

public class Validd_Palindrome {
	
	public static void main(String[] args) {
		
		String s="Race Car";
		
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
				if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
				{
					isPalindrome=false;
					break;
				}
				
				start++;
				end--;
			}	
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
