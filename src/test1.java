import java.util.*;

public class test1 {
    public static List<Map.Entry<String, Integer>> wordOccurrences(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count occurrences of each word
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Create a list from the word count map entries
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());

        // Sort the list by count, and then by original order
        sortedWords.sort((a, b) -> {
            int countCompare = a.getValue().compareTo(b.getValue());
            if (countCompare != 0) {
                return countCompare; // Sort by count if different
            }
            return Arrays.asList(words).indexOf(a.getKey()) - Arrays.asList(words).indexOf(b.getKey()); // Sort by original order if count is the same
        });

        return sortedWords;
    }

    public static void main(String[] args) {
        String input = "hello world hello world 123";
        List<Map.Entry<String, Integer>> result = wordOccurrences(input);

        // Print the result
        System.out.println(result);
    }
}
