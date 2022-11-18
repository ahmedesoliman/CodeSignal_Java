
// Given the string, check if it is a palindrome.

// Example

// For inputString = "aabaa", the output should be
// solution(inputString) = true;
// For inputString = "abac", the output should be
// solution(inputString) = false;
// For inputString = "a", the output should be
// solution(inputString) = true.

public class CheckPalindrome {
    boolean solution(String inputString) {
        boolean isPalindrome = true;
        int length = inputString.length();
        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    // This is a more concise solution:
    // boolean solution(String inputString) {
    // return inputString.equals(new
    // StringBuilder(inputString).reverse().toString());
    // }

    // test code for solution
    public static void main(String[] args) {
        CheckPalindrome test = new CheckPalindrome();
        System.out.println(test.solution("aabaa"));
        System.out.println(test.solution("abac"));
        System.out.println(test.solution("a"));
    }

}
