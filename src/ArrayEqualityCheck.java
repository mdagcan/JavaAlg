import java.util.Arrays;

public class ArrayEqualityCheck {
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if lengths are the same
        if (array1.length != array2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        int[] array1 = {4, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};

        if (areArraysEqual(array1, array2)) {
            System.out.println("The arrays contain the same elements.");
        } else {
            System.out.println("The arrays are different.");
        }
    }
}
