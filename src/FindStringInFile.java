import java.io.*;

public class FindStringInFile {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Dosya adı
        String searchString = "a";      // Aranacak karakter veya kelime

        // Dosya yoksa oluştur ve örnek yazılar ekle
        createFileIfNotExists(filePath);

        // Dosyada karakteri ara
        searchInFile(filePath, searchString);
    }

    // Dosya yoksa oluştur ve örnek yazılar ekle
    public static void createFileIfNotExists(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("This is an example text file.\n");
                writer.write("It contains sample sentences.\n");
                writer.write("Feel free to modify or search through it.\n");
                writer.write("Java makes file handling easy.\n");
                System.out.println("Dosya oluşturuldu ve örnek yazılar eklendi: " + filePath);
            } catch (IOException e) {
                System.err.println("Dosya oluşturulurken bir hata oluştu: " + e.getMessage());
            }
        }
    }

    // Dosyada belirtilen karakter veya kelimeyi ara
    public static void searchInFile(String filePath, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            // Dosyayı satır satır oku ve ara
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchString)) {
                    System.out.println("Bulundu: '" + searchString + "' satır " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("'" + searchString + "' karakteri/kelimesi dosyada bulunamadı.");
            }
        } catch (IOException e) {
            System.err.println("Dosya okunurken bir hata oluştu: " + e.getMessage());
        }
    }
}
