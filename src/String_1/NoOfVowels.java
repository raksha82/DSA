package String_1;

public class NoOfVowels {
	
	public static void main(String[] args) {
		
		String a ="Hello";
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			
			if(Character.toLowerCase(a.charAt(i))== 'a' || Character.toLowerCase(a.charAt(i))== 'e' || Character.toLowerCase(a.charAt(i))== 'i'
					|| Character.toLowerCase(a.charAt(i))== 'o'||Character.toLowerCase(a.charAt(i))== 'u')
				
			{
				count++;
			}
		}
		
		System.out.println("No.of.Vowels:"+count);
		
	}

}
