// Given an array of integers numbers, find and return the index i of the first integer within the array that is less than its adjacent integers on both sides. Note that to satisfy these criteria, adjacent integers on both sides must exist.

// Return -1 if none of the integers in the given array fit the criteria.

// Assume that array indices are 0-based.

// Example

// For numbers = [1, 2, 3, 4], the output should be solution(numbers) = -1.

// Explanation:
// None of the integers are less than both of its adjacent integers, so the output is -1.

// For numbers = [3, 2, 1, 3, 2, 3], the output should be solution(numbers) = 2.

// Explanation:

// numbers[2] = 1 is less than both numbers[1] = 2 and numbers[3] = 3;
// numbers[4] = 2 also fit the criteria as it is less than both numbers[3] = 3 and numbers[5] = 3. However, numbers[2] has a lower index, so 2 is the answer.
// For numbers = [1], the output should be solution(numbers) = -1.

// Explanation:
// There are no integers with neighbors, so the criteria cannot be met.

int solution(int[] numbers) {
    
    //return the index i of the first integer within the array.
    // int first = numbers[0];
    // int second = first + 2;
    // int element = numbers[first + 1];

    for (int i = 0; i < numbers.length; i++){    
        int first = numbers[i];
        int second = first + 2;
        int element = numbers[first + 1];
        int lowest = 0;
        
        if (element < first && element < second) {
            lowest = Arrays.asList(numbers).indexOf(element);
            return lowest;
        }

        
    }
    
    return -1;

}
