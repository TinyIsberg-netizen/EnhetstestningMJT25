package iths;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null) return false;
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}