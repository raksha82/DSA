package String_1;

public class Palindrome {
	
  public static void main(String[] args) {
		
		String a="Malayalam";
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
			reverse += a.charAt(i);
		}
		
		
		System.out.println("String :"+a);
		System.out.println("Reverse String:"+reverse);
		
		if(a.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println("It is a Palindrome");
		}
		
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
