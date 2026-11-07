package String_day2;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		
		String str = "programming";
		char target = 'g';
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch == target)
			{
				count++;
			}
		}
		
		System.out.println("String:"+str);
		System.out.println("Frequency of "+target+" :"+count);
	}

}
