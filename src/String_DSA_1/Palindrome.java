package String_DSA_1;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s="madam";
		boolean isPalindrome=true;
		int start=0;
		int end=s.length()-1;
		
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				isPalindrome=false;
				break;
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
