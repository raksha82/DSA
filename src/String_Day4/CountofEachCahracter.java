package String_Day4;

import java.util.Arrays;

public class CountofEachCahracter {
	
	public static void main(String[] args) {
	
		
		String a = "programming";

		boolean visited[] = new boolean[a.length()];

		for (int i = 0; i < a.length(); i++) {

		    if (visited[i]) {
		        continue;
		    }

		    int count = 0;

		    for (int j = 0; j < a.length(); j++) {

		        if (a.charAt(i) == a.charAt(j)) {
		            count++;
		            visited[i]=true;
		        }
		    }

		    System.out.println(a.charAt(i) + " - " + count);
		}
		
		
	}
}
