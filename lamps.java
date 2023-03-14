// There are some lamps placed on a coordinate line. Each of these lamps illuminates some space around it within a given radius. You are given the coordinates of the lamps on the line, and the effective radius of each of the lamps' light.

// In other words, you are given a two-dimensional array lamps, where lamps[i] contains information about the ith lamp.

// lamps[i][0] is an integer representing the lamp's coordinate;
// lamps[i][1] is a positive integer representing the lamp's effective radius.
// That means that the ith lamp illuminates everything in a range from lamps[i][0] - lamps[i][1] to lamps[i][0] + lamps[i][1] inclusive.
// Your task is to find the number of integer coordinates that are illuminated by exactly 1 lamp.

// Example

// For lamps = [[-2, 3], [2, 3], [2, 1]], the output should be solution(lamps) = 6.

// The first lamp illuminates everything in range [-2 - 3, -2 + 3] = [-5, 1].
// The second lamp illuminates everything in range [2 - 3, 2 + 3] = [-1, 5].
// The third lamp illuminates everything in range [2 - 1, 2 + 1] = [1, 3].
// The points that are illuminated by exactly 1 lamp are [-5, -4, -3, -2, 4, 5], hence the answer is 6.

// For lamps = [[-2, 1], [2, 1]], the output should be solution(lamps) = 6.
// The given lamps illuminate ranges [-3, -1] and [1, 3] respectively. Every point in these ranges is illuminated by exactly 1 lamp, so the answer is 6.

public class lamps {

    // solution
    int solution(int[][] lamps) {
        int count = 0;
        for (int i = 0; i < lamps.length; i++) {
            int first = lamps[i][0];
            int second = lamps[i][1];
            int range = first - second;
            int range2 = first + second;
            for (int j = 0; j < lamps.length; j++) {
                int first2 = lamps[j][0];
                int second2 = lamps[j][1];
                int range3 = first2 - second2;
                int range4 = first2 + second2;
                if (range3 <= range && range4 >= range2) {
                    count++;
                }
            }
        }
        return count;
    }

    // test code for solution
    public static void main(String[] args) {
        lamps test = new lamps();
        int[][] lamps = { { -2, 3 }, { 2, 3 }, { 2, 1 } }; // expected output: 6
        System.out.println(test.solution(lamps));
    }

}
