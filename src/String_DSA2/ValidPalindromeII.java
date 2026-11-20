package String_DSA2;

public class ValidPalindromeII {
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		
		String a=s;
		a=a.toLowerCase().replaceAll("[^a-z0-9]", "");
		int start=0;
		int end=a.length()-1;
		boolean isValid=true;
		
		while(start<end)
		{
			if(a.charAt(start)==a.charAt(end))
			{
				start++;
				end--;
			}
			
			else
			{
				isValid = false;
				break;
				
			}
		}
		
		if(isValid)
		{
			System.out.println(s+" -- is a Valid Palindrome");
			
		}
		
		else
			
		{
			System.out.println(s+" -- is not  a Valid Palindrome");
		}
	}

}
