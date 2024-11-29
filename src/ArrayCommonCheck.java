import java.util.HashSet;

public class ArrayCommonCheck {
    public static boolean haveCommonElement(int[] array1, int[] array2) {
        // Add elements of the first array to a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        // Check if any element in the second array exists in the HashSet
        for (int num : array2) {
            if (set.contains(num)) {
                return true; // Common element found
            }
        }

        return false; // No common elements
    }

    public static void main(String[] args) {
        int[] array1 = {4, 2, 3, 1};
        int[] array2 = {5, 6, 7, 2};

        if (haveCommonElement(array1, array2)) {
            System.out.println("The arrays have at least one common element.");
        } else {
            System.out.println("The arrays do not share any common elements.");
        }
    }
}
