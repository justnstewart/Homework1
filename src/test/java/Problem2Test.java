import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                // TODO: add more test case inputs
        };
        int[][] expects = {
                {1, 2, 3},
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays

        for (int i = 0; i < inputs.length; i++) {
            // TODO: add a call to your bubble sort function here

            // This checks whether the actual result matches the expects result.
            // Note the use of assertArrayEquals instead of assertEquals here.
            // "less code == less chance of mistake"
                assertArrayEquals(expects[i], inputs[i]);
        }
    }
}
