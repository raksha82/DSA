package Practicce;

public class Continue {
	
	public static void main(String[] args) {
		
		System.out.println("Continue Statement");
		System.out.println();
		
		for(int i=1 ;i<=10;i++)
		{
			if(i%3 == 0)
			{
				continue;
			}
			
			System.out.println("Iteration no:"+i);
		}
	}

}
