package String_1;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="Malayalam";
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
			reverse += a.charAt(i);
			reverse=reverse.toLowerCase();
		}
		
		
		System.out.println("String :"+a);
		System.out.println("Reverse String:"+reverse);
	}
}
