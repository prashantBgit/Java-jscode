import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
    public static boolean isPangram(String str) {
        // Create an array to store whether each letter is present (A-Z)
        boolean[] letters = new boolean[26];
        
        // Convert the input string to uppercase for case-insensitivity
        str = str.toUpperCase();
        
        // Iterate through the string and mark each letter as encountered
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                letters[ch - 'A'] = true;
            }
        }
        
        // Check if all letters have been encountered
        for (boolean letterPresent : letters) {
            if (!letterPresent) {
                return false;
            }
        }
        
        return true;
    }
}