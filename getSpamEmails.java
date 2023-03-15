import java.util.ArrayList;
import java.util.List;

// implement a prototype spam detection algorithm
// for simulation, subjects of n emails and k spam words are given in two arrays if strings, subject and spam_words. 
// An email is considered spam if its subject contains at least two of the spam words in the subject.
// if spam word is repeted, it counts as two so the email is conidered spam. The spam words are not case-sensitive. 

//given subjects and spam_words, return an array of n strings, "spam" or "not spam" one for each subject. 

//Example: suppose subjects = ["free prize worth millions", "ten tips for a carefree lifestryle"] and spam_words = ["free", "money", "win", "millions"]

public class getSpamEmails {

    public static List<String> solution(List<String> subjects, List<String> spam_words) {
        // Write your code here
        List<String> result = new ArrayList<>();
        for (String subject : subjects) {
            int count = 0;
            for (String spam_word : spam_words) {
                if (subject.toLowerCase().contains(spam_word.toLowerCase())) {
                    count++;
                }
            }
            if (count >= 2) {
                result.add("spam");
            } else {
                result.add("not spam");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("I paid him paid");
        subjects.add("Summertime Sadness");

        List<String> spam_words = new ArrayList<>();
        spam_words.add("I");
        spam_words.add("sadness");
        spam_words.add("paid");
        System.out.println(solution(subjects, spam_words));
    }

}
