// Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

// Example

// For inputArray = [3, 6, -2, -5, 7, 3], the output should be
// solution(inputArray) = 21.

// 7 and 3 produce the largest product.

public class AdjacentElementsProduct {

    int solution(int[] inputArray) {
        int largestProduct = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i + 1];
            if (product > largestProduct) {
                largestProduct = product;
            }
        }
        return largestProduct;
    }

    // test code for solution
    public static void main(String[] args) {
        AdjacentElementsProduct test = new AdjacentElementsProduct();
        int[] inputArray = { 3, 6, -2, -5, 7, 3 }; // expected output: 21
        System.out.println(test.solution(inputArray));
    }

}
