public class CharacterPyramid {
    public static void main(String[] args) {
        int rows = 33; // Number of rows in the pyramid
        char startChar = 'A'; // Starting character

        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print characters in ascending order
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (startChar + j));
            }

            // Print characters in descending order
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) (startChar + j));
            }

            // Move to the next line
            System.out.println();
        }
    }
}
