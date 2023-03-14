// Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

// Example

// For year = 1905, the output should be
// solution(year) = 20;
// For year = 1700, the output should be
// solution(year) = 17.
public class CenturyFromYear {

    int solution(int year) {
        int century = 0;
        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        return century;
    }

    // test code for solution
    public static void main(String[] args) {
        CenturyFromYear test = new CenturyFromYear();
        int year = 1700; // expected output: 17
        System.out.println(test.solution(year));
    }

}
