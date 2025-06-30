import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        // Trying out a sample array – might replace this with user input later
        int[] myNums = {3, 5, 7, 10, 14};
        int searchValue = 7;

        // Let's see where 7 is in this list
        int indexFound = binarySearch(myNums, searchValue);

        // Should give us 2 if all goes well
        System.out.println(indexFound);
    }

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {
        // Just in case someone passes in a null
        if (data == null) {
            System.out.println("Warning: Array was null. Nothing to search.");
            return -1;
        }

        int start = 0; // starting boundary
        int end = data.length - 1; // ending boundary

        // Going to loop while we still have a valid range
        while (start <= end) {
            // Probably could use >>> for unsigned shift but this is easier to read
            int mid = (start + end) / 2;

            // Debug print – handy during dev
            System.out.println("Looking at index " + mid + ", value: " + data[mid]);

            // Did we find it?
            if (data[mid] == target) {
                return mid;
            }

            // Deciding which half to search next
            if (target < data[mid]) {
                end = mid - 1;  // shift left
            } else {
                start = mid + 1;  // shift right
            }
        }

        // If we're here, the number wasn't found
        return -1;
    }
}
