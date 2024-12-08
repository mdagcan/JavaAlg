import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        // Create two lists
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new ArrayList<>();
        list2.add("Orange");
        list2.add("Grape");

        // Merge list2 into list1
        list1.addAll(list2);

        // Print merged list
        System.out.println("Merged List: " + list1);
    }
}
