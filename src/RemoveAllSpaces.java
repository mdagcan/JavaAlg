public class RemoveAllSpaces {
    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        String input = "Java Programming Language";
        System.out.println(removeSpaces(input));
    }
}
