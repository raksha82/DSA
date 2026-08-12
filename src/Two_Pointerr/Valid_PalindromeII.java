package Two_Pointerr;

public class Valid_PalindromeII {
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		String a=s;
		a=a.toLowerCase().replaceAll("[^a-z0-9]", "");
		int start=0;
		int end=a.length()-1;
		boolean isvalid=true;
		
		while(start<end)
		{
			if(a.charAt(start) == a.charAt(end))
			{
				start++;
				end--;
			}
			
			else
			{
				isvalid=false;
				break;
			}
		}
		
		if(isvalid)
		{
			System.out.println(s+" - is a Valid Palindrome");
		}
		
		else
		{
			System.out.println(s+" - is not a Valid Palindrome");
		}

	}

}
