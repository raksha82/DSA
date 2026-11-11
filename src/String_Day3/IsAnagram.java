package String_Day3;

public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "abb";
        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        boolean positive[] = new boolean[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j) && !positive[j]) {

                    positive[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Not an Anagram");
                return;
            }
        }

        System.out.println("The given strings are Anagrams");
    }
}
