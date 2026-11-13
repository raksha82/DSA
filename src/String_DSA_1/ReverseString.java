package String_DSA_1;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Programming";
		
		int start=0;
		int end=s.length()-1;
		
		char[] result=s.toCharArray();
		
		System.out.println("Given String:"+s);
		
		while(start<end)
		{
			char temp=result[start];
			result[start]=result[end];
			result[end]=temp;
			
			start++;
			end--;
		}
		
		s=new String(result);
		
		System.out.println("Reversed String:"+s);
	}

}
