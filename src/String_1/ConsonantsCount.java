package String_1;

public class ConsonantsCount {
	
	public static void main(String[] args) {
		
		
		String a="Hello Doctor Malini";
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			
			char ch=Character.toLowerCase(a.charAt(i));
			
			if(ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			{
				count++;
			}
			
		}
		
		System.out.println("String:"+a);
		System.out.println("No of Consonants:"+count);
		
	}
	
	

}
