package rustem.saitkulov;

public final class Task3 {

    //Constructor must be private for utils
    private Task3() {}

    public static String reverse(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();

        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            swapChars(chars, i, j);
        }

        return String.valueOf(chars);
    }

    public static String reverseRecursively(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();

        reverse(chars, 0, chars.length - 1);

        return String.valueOf(chars);
    }

    private static void reverse(char[] array, int i, int j){
        if (i < j) {
            swapChars(array, i, j);
            reverse(array, ++i, --j);
        }
    }

    private static void swapChars(char[] chars, int i, int j){
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }
}