import java.util.HashSet;

public class CommonElementsCount {
    public static int countCommonElements(int[] array1, int[] array2) {
        // İlk array'in elemanlarını bir HashSet'e ekle
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        // Ortak elemanları bulmak için ikinci array'i kontrol et
        int commonCount = 0;
        for (int num : array2) {
            if (set.contains(num)) {
                commonCount++;
                set.remove(num); // Tekrar sayılmasını önlemek için elemanı kaldır
            }
        }

        return commonCount;
    }

    public static void main(String[] args) {
        //int[] array1 = {1, 2, 3, 4, 5};
        //int[] array2 = {3, 4, 5, 6, 7};
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 2, 3, 5, 6};

        int commonCount = countCommonElements(array1, array2);
        System.out.println("Ortak eleman sayısı: " + commonCount);
    }
}
