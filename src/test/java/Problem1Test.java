import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    /*
    Do not change any tests you received from teacher.
     */
    @Test
    public void binarySearch() {
        int[][] inputs = {
                null,
                {},
                {3},
                {3},
                {1, 3},
                {1, 3},
                {4, 6, 8},
                {4, 6, 8},
                {4, 6, 8},
                {3, 5, 7, 9, 20},
                {3, 5, 7, 9, 20},
        };
        int[] targets = {9, 9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int[] answer = {-1, -1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i = 0; i < inputs.length; i++) {

            // This is what the correct result should be
            int expected = answer[i];

            // This is the actual result produced by our function
            int actual = Problem1.binarySearch(inputs[i], targets[i]);

            // Assert ("verify") the actual result matches the expected correct result.
            // Test passes if they match. Test fails otherwise.
            // Note that in assertEquals statement like this, the expected value should appear BEFORE the actual value
            assertEquals("case " + i, expected, actual);
        }
    }

    @Test
    public void binarySearchWithDuplicates() {
        /*
            TODO: Write another test function for the case of input with duplicates
             Goal: Make sure your binarySearch function correctly handles arrays where the target appears more than once.
             Follow the same format in the test function above.
             You can define the behavior when there's duplicates. For example:
             input: [1, 2, 3, 3, 3, 4, 5, 6], search target = 3
             In this case, which index should be returned? 2, 3 or 4? Your call. Write the tests based on your decision, and then implement the code based on your logic.
        */
    }
}
