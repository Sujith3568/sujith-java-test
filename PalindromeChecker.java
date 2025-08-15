
public class PalindromeChecker {
  public static boolean isPalindrome(String s){
    boolean result = false;
    //Replaces the spaces,punctuation and converts to lower case 
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reversed = new StringBuilder(cleaned).reverse().toString();
    if(reversed.equals(cleaned)){
        result = true;
    }
    return result;
  }
  public static void main(String[] args) {
    //Test cases
    System.out.println(isPalindrome("A man a plan a canal Panama"));
    System.out.println(isPalindrome("radar"));
    System.out.println(isPalindrome("hello"));
    System.out.println(isPalindrome(""));
  }
}
