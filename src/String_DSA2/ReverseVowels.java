package String_DSA2;

public class ReverseVowels {

	
	public static void main(String[] args) {
		
		    String s="programming";
		
			char[] a=s.toCharArray();
			int start=0;
			int end=a.length-1;
			
			if(s.isEmpty())
		    {
		    	System.out.println("enter the valid String");
		    }
			
			else
			{
			
			while(start<end)
			{
				
				
			if((a[start] == 'a' || a[start] == 'e'|| a[start] == 'i' || a[start] == 'o' ||a[start] == 'u') && 
			(a[end] == 'a' || a[end]  == 'e' || a[end]  == 'i' || a[end]  == 'o' ||  a[end]  == 'u' ))
			{
				char temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
			
			else if(a[start] == 'a' || a[start] == 'e'|| a[start] == 'i' || a[start] == 'o' ||a[start] == 'u')
			{
				end--;
			}
			
			else if (a[end]  == 'a' || a[end]  == 'e' || a[end]  == 'i' || a[end]  == 'o' ||  a[end]  == 'u')
			{
				start++;
			}
			
			else
			{
				start++;
				end--;
			}
		    }
			
			s=new String(a);
			System.out.println("Reverse Vowels:"+s);
			}
			
			
	}
}
