import java.util.Random;

public class FisherYatesShuffle {
    public static void main(String[] args) {
        // Rastgele 1000000000 elemanlı array oluştur
        int[] array = generateRandomArray(1000000000);

        // Karıştırmadan önce array'i yazdır (opsiyonel)
        System.out.println("Original Array (First 10 elements):");
        printArray(array, 10);

        // Fisher-Yates algoritması ile array'i karıştır
        shuffleArray(array);

        // Karıştırdıktan sonra array'i yazdır (opsiyonel)
        System.out.println("Shuffled Array (First 10 elements):");
        printArray(array, 10);
    }

    // Rastgele 1000 elemanlı array oluşturma
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000000); // 0 ile (1000000000-1) arasında rastgele değerler
        }
        return array;
    }

    // Fisher-Yates Shuffle algoritması
    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            // Rastgele bir indeks seç
            int j = random.nextInt(i + 1);

            // array[i] ile array[j] yer değiştir
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Array'in ilk n elemanını yazdırma
    public static void printArray(int[] array, int n) {
        for (int i = 0; i < Math.min(array.length, n); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
