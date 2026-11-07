package String_day2;

public class FirstOccurence {

	public static void main(String[] args) {
		
		String str = "programming";
		char target = 'm';
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==target)
			{
				System.out.println("First occurrence of "+target+" is at index:" +i);
				return;
			}
		}
	}
}
