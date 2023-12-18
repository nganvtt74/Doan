public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        String strWithFirstLetterUppercase = capitalizeFirstLetter(str);
        System.out.println(strWithFirstLetterUppercase);
    }

    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        } else {
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        }
    }
}
