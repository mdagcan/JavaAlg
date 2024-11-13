public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false
    }

    public static boolean stringContainsVowels(String input) {
        if (input.contains("a"))
                return true;
        else if (input.contains("e"))
            return true;
        else if (input.contains("i"))
            return true;
        else if (input.contains("o"))
            return true;
        else if (input.contains("u"))
            return true;
        else
            return false;
    }
}
