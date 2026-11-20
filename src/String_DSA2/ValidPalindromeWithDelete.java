package String_DSA2;

public class ValidPalindromeWithDelete {

	public static void main(String[] args) {
		
		String s="abca";
		
		int start=0;
		int end=s.length()-1;
		int count=0;
		boolean isValid=true;
		
		while(start<end)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				start++;
				end--;
			}
			
			else
			{
				if(count<=0)
				{
					start++;
					count++;
				}
				
				else
				{
					isValid=false;
					break;
				}
			}
			
			
		}
		
		if(isValid)
		{
			System.out.println("True");
		}
		
		else
		{
			System.out.println("False");
		}

	}

}
