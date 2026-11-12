package String_Day5;

public class NoOfWords {

	public static void main(String[] args) {
		
		String s="Java is Easy to Leran";
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i) == ' ' && (i==0 || s.charAt(i-1) != ' ' ))
			{
				count++;
				
			}
		}
		
		
		System.out.println("Total Number of Words:"+count);
	}
}
