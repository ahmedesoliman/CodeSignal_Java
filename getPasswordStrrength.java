import java.io.*;
import java.util.ArrayList;
import java.util.List;

// there are n passwords in the form of a string array of passwords[n] and ther is also a dictionary dict_words[m] that contains common words.

// clasify each of the n passwords as "weak or "strong" based on the following criteria:

// the password is weak if any of the these condition are met:
// the password is in the dictionary
// A substring of the password is a word in the dictionary
// the password is all numerical, i.e., consisting of characters from (0 to 9)
// all characters are upper case (A to Z ) or lower case (a to z)
// the password is strong otherwise

// implement a prototype password validation service

// given a list of n strings, passwords, and m strings, common_words, for each of the passwords, report "weak" or "strong"

// Example: 
// Suppose n = 5 , m = 3, password = ["iliketoCode", "teaMAKEsmeHAPPY", "abracaDabra", "PasSword", "blackcoffeeISthebest"] and common_words = ["coffee", "coding", "happy"]

// i) "iliketoCode" is strong because it is not in the dictionary and no substring is a word in the dictionary
// ii) "teaMAKEsmeHAPPY" is weak beacuse contains "happy" which is in the dictionary
// iii) "abracaDabra" is stromg because it is not in the dictionary and no substring is a word in the dictionary
// iv) "PasSword" is strong because it is not in the dictionary and no substring is a word in the dictionary
// v) "blackcoffeeISthebest" is weak because it contains "coffee" which is in the dictionary

public class getPasswordStrrength {

    public static List<String> solution(List<String> passwords, List<String> common_words) {
        // Write your code here
        List<String> result = new ArrayList<>();

              // first case is if the password is in the dictionary
              for (String password : passwords) {
                if (common_words.contains(password)) {
                    result.add("weak");
                    continue;
                }
                boolean isWeak = false;
    
                // second case is if a substring of the password is a word in the dictionary
                // check if any substring of the password is a word in the dictionary
                // either upper or lower case
                for (String word : common_words) {
                    if (password.contains(word) || password.contains(word.toUpperCase())
                            || password.contains(word.toLowerCase())) {
                        result.add("weak");
                        isWeak = true;
                        break;
                    }
                }
        
                // third case is if the password is all numerical (0 to 9)
                if (password.chars().allMatch(Character::isDigit)) {
                    result.add("weak");
                    continue;
                }
    
                // fourth case is if all characters are upper case (A to Z) or lower case (a to
                // z)
                if (password.chars().allMatch(Character::isUpperCase)
                        || password.chars().allMatch(Character::isLowerCase)) {
                    result.add("weak");
                    continue;
                }

                // fifth case is if the password shorter than 6 characters
                if (password.length() < 6) {
                    result.add("weak");
                    continue;
                }
                
                // if none of the above cases are met, then the password is strong
                result.add("strong");
            }
            return result;

    }

    // test code for solution
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("iliketoCode");
        passwords.add("teaMAKEsmeHAPPY");
        passwords.add("abracaDabra");
        passwords.add("PasSword");
        passwords.add("blackcoffeeISthebest");

        List<String> common_words = new ArrayList<>();
        common_words.add("coffee");
        common_words.add("coding");
        common_words.add("happy");

        System.out.println(solution(passwords, common_words));
    }

}
