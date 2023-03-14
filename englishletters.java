// Let's define a word as a string consisting of lowercase English letters. A word is called interesting if it contains a substring satisfying the following criteria:

// this substring consists of the same letter (let's call it alpha) repeated n times;
// either the word starts with this substring OR the letter immediately before the substring is different from alpha;
// either the word ends with this substring OR the letter immediately after the substring is different from alpha.
// For example, if n = 3,

// words aaab, abbb, and cdddee are all interesting (substrings that make them interesting are shown in brackets: [aaa]b, a[bbb], c[ddd]ee);
// word cddee is NOT interesting because it does not contain a substring consisting of the same letter repeated 3 times;
// word aaaab is NOT interesting: the substring highlighted in a[aaa]b is preceded by the letter a, and the substring highlighted in [aaa]ab is followed by the letter a.
// Given a string text and an integer n, count the number of interesting words in text.

// Note: text consists of words separated by single spaces.

public class englishLetters {

    // solution
    public int solution(String text, int n) {
        int count = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() < n) {
                continue;
            }
            for (int i = 0; i < word.length() - n + 1; i++) {
                String sub = word.substring(i, i + n);
                if (sub.chars().distinct().count() == 1) {
                    if (i == 0 || word.charAt(i - 1) != sub.charAt(0)) {
                        if (i + n == word.length() || word.charAt(i + n) != sub.charAt(0)) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    // test code for solution
    public static void main(String[] args) {
        englishLetters test = new englishLetters();
        String text = "aaab abbb cdddee"; // expected output: 3
        int n = 3;
        System.out.println(test.solution(text, n));
    }

}