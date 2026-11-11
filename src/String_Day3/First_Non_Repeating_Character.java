package String_Day3;

public class First_Non_Repeating_Character {
	public static void main(String[] args) {
		
		
		String p="swiss";
		
		
		for(int i=0;i<p.length()-1;i++)
		{
			boolean positive=true;
			for(int j=0;j<p.length();j++)
			{
				if(i !=j && p.charAt(i) == p.charAt(j))
				{
					positive=false;
				    break;
				}
					
			}
			
			
			if(positive)
			{
				System.out.println("The non-repeating Character:"+p.charAt(i));
				return;		
			}
		}	
	}
}
