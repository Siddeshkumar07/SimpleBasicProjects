import java.util.Scanner;

public class VowelConsonantCounter {
    
          public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Convert the word to lowercase to handle case insensitivity
        word = word.toLowerCase();

        int vowelCount = 0;
        int consonantCount =0;

        // Iterate through each character of the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }else{
                consonantCount++;

            }
        }

        System.out.println("Number of vowels in the word: " + vowelCount);
        System.out.println("Number of vowels in the word: " + consonantCount);

        sc.close();
    }
}
