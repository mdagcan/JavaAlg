import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static List<String> wordOccurrences(String input) {
        String[] words = input.split("\\s+");

        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (String word : words) {
            if (uniqueWords.contains(word)) {
                // Eğer kelime zaten listede varsa, sayacını artır
                int index = uniqueWords.indexOf(word);
                counts.set(index, counts.get(index) + 1);
            } else {
                // Eğer kelime listede yoksa, listeye ekle ve sayacını 1 yap
                uniqueWords.add(word);
                counts.add(1);
            }
        }

        // Sonuçları azdan çoka doğru sıralıyoruz
        List<String> result = new ArrayList<>();
        List<Integer> sortedIndexes = new ArrayList<>();

        for (int i = 0; i < counts.size(); i++) {
            sortedIndexes.add(i);
        }

        // Sıralama: Önce count değerine göre, sonra orijinal sıraya göre
        sortedIndexes.sort((a, b) -> {
            int countCompare = counts.get(a).compareTo(counts.get(b));
            if (countCompare != 0) {
                return countCompare;
            }
            return a - b;
        });

        // Sıralanmış sonuçları ekleyerek oluşturuyoruz
        for (int index : sortedIndexes) {
            result.add("(" + uniqueWords.get(index) + ", " + counts.get(index) + ")");
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "hello world hello world 123";
        List<String> result = wordOccurrences(input);
        System.out.println(result);
    }
}
