import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Call the shuffle method
        shuffleArray(array);

        // Print the shuffled array
        System.out.println("Shuffled Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        // Fisher-Yates shuffle
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index
            int j = random.nextInt(i + 1);

            // Swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
