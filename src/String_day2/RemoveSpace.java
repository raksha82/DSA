package String_day2;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String str = "Java Programming is Easy";
	    String result="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) !=' ')
			{
				result+=str.charAt(i);
			}
		}
		
		System.out.println("Original String:"+str);
		System.out.println("String after space removal:"+result);
	}

}
