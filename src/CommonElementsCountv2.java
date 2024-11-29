import java.util.Arrays;

public class CommonElementsCountv2 {
    public static int countCommonElements(int[] array1, int[] array2) {
        // Dizileri sıralıyoruz
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0, commonCount = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                commonCount++;
                int current = array1[i];

                // Bir sonraki farklı elemana geçmek için tekrarlayanları atla
                while (i < array1.length && array1[i] == current) {
                    i++;
                }
                while (j < array2.length && array2[j] == current) {
                    j++;
                }
            } else if (array1[i] < array2[j]) {
                i++; // Küçük olan pointer'ı ilerlet
            } else {
                j++; // Küçük olan pointer'ı ilerlet
            }
        }

        return commonCount;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 2, 3, 5, 6};

        int commonCount = countCommonElements(array1, array2);
        System.out.println("Ortak eleman sayısı: " + commonCount);
    }
}
