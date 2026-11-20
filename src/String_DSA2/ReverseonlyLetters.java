package String_DSA2;

public class ReverseonlyLetters {
	
	public static void main(String[] args) {
		
		String a ="ab-cd";
		
		char[] c=a.toCharArray();
		int start=0;
		int end=c.length - 1;
		
		if(a.isEmpty())
		{
			System.out.println("Enter the Valid String");
		}
		
		else
		{
			
		while(start<end)
		{
		
			if(((c[start] >= 'a' && c[start] <= 'z' )||(c[start] >= 'A' && c[start] <= 'Z')) && 
				((c[end] >= 'A' && c[end] <= 'Z')||(c[end] >= 'a' && c[end] <= 'z')) )
			{
				char temp=c[start];
				c[start]=c[end];
				c[end]=temp;
				start++;
				end--;
			}
			
			else if((c[start] >= 'a' && c[start] <= 'z' )||(c[start] >= 'A' && c[start] <= 'Z'))
			{
				end--;
			}
			
			else if((c[end] >= 'A' && c[end] <= 'Z')||(c[end] >= 'a' && c[end] <= 'z'))
			{
				start++;
			}
			
			else
			{
				start++;
				end--;
			}
			
		}
		
		
		a=new String(c);
		System.out.println("Reverse only Letters:"+a);
		
		}
	}

}
