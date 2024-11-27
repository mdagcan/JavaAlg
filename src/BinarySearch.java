import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(long[] array, long target) {
        int left = 0;
        int right = array.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Yeni orta deger : " + mid);
            if (array[mid] == target) {
                return mid; // Hedef bulundu
            } else if (array[mid] < target) {
                left = mid + 1; // Sağ yarıya bak
            } else {
                right = mid - 1; // Sol yarıya bak
            }
            count += 1;
        }
        return -1; // Hedef bulunamadı
    }


    public static void main(String[] args) {
        int size = 99999999; // Array boyutu
        long[] array = new long[size];

        // For döngüsü ile array doldurma
        for (int i = 0; i < size; i++) {
            array[i] = i * 10L; // Örnek: 0, 10, 20, 30, ...
        }
        //System.out.println(Arrays.toString(array));
        long target = 70; // Aranacak değer

        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Eleman bulundu, indeks: " + result);
        } else {
            System.out.println("Eleman bulunamadı.");
        }
    }
}
