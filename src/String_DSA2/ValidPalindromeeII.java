package String_DSA2;

public class ValidPalindromeeII {
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		
		int start=0;
		int end=s.length()-1;
		boolean isValid=true;
		
		while(start<end)
		{
			if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end)) )
			{
				if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end)) )
				{
					start++;
					end--;
				}
				
				else
				{
					isValid=false;
					break;
				}
			}
			
			else if(Character.isLetterOrDigit(s.charAt(start)))
			{
				end--;
			}
			
			else if(Character.isLetterOrDigit(s.charAt(end)))
			{
				start++;
			}
			
			
			else
			{
				start++;
				end--;
			}
			
			
		}
		
		if(isValid)
		{
			System.out.println(s+" - is a Valid Palindrome");
		}
		
		else
		{
			System.out.println(s+" - is not a Valid Palindrome");
		}
	}

}
