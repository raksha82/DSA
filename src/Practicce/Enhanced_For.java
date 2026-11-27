package Practicce;

public class Enhanced_For {

	public static void main(String[] args) {
		
		String[] animals= {"Tiger" , "Lion" , "Zebra" , "Monkey" , "Cheetah" , "Black Panther" , "Elephant" , "Deer"};
		
		System.out.println("*********************************");
		System.out.println("Traversal using Enhanced For Loop ");
		System.out.println("*********************************");
		System.out.println();
		
		for(String animal : animals)
		{
			System.out.println("- " +animal);
			System.out.println();
		}
	}
}
