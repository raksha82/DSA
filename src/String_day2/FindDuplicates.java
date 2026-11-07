package String_day2;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String str = "programming";
		
		System.out.println("String"+str);
		System.out.print("Duplicates:");
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					System.out.print(str.charAt(i) + " ");
				}
			}
		}
	}
}
