package String_day2;

public class FindUpperLower {
	
	public static void main(String[] args) {
		
		String str = "Hello JAVA Programming";
		int lower=0;
		int upper=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				lower++;
			}
			
			else if(ch>='A' && ch <= 'Z')
			{
				upper++;
			}
			
			else
			{
				
			}
		}
		
		
		System.out.println("String:"+str);
		System.out.println("UpperCase Letters:"+upper);
		System.out.println("LowerCase Letters:"+lower);
					
		}
	}

