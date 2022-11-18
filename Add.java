// Write a function that returns the sum of two numbers.

// Example

// For param1 = 1 and param2 = 2, the output should be
// solution(param1, param2) = 3.

public class Add {
    int solution(int param1, int param2) {
        return param1 + param2;
    }

    // test code for solution
    public static void main(String[] args) {
        Add test = new Add();
        System.out.println(test.solution(1, 2));
    }
}
