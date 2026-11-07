package String_day2;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str = "programming";
        String result = "";

        // Loop through all characters (including the last one)
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            // indexOf returns -1 if the character is NOT found in the result string
            if (result.indexOf(current) == -1) {
                result += current; 
            }
        }

        System.out.println("New String: " + result); 
	}

}
