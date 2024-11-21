import java.util.List;

public class OnlyOdd {

        public static boolean containsOnlyOddNumbers(List<Integer> numbers) {
            for (int num : numbers) {
                if (num % 2 == 0) {
                    return false; // Even number found
                }
            }
            return true; // All numbers are odd
        }

        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 3, 5, 7, 9);
            System.out.println(containsOnlyOddNumbers(numbers)); // true
        }

}
