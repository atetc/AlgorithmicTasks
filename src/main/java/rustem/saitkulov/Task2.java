package rustem.saitkulov;

public final class Task2 {

    //Constructor must be private for utils classes
    private Task2() {}

    public static String reverseWords(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();

        // reverse all array
        reverseChars(chars, 0, chars.length);

        // re-reverse each words
        int wordEnd;
        for (int wordStart = 0; wordStart < chars.length; wordStart = wordEnd + 1) {
            for (wordEnd = wordStart; wordEnd < chars.length && chars[wordEnd] != ' '; wordEnd++) {}

            reverseChars(chars, wordStart, wordEnd);
        }

        return String.valueOf(chars);
    }

    private static void reverseChars(char[] chars, int start, int end) {
        int halfLength = end - start >> 1;

        for (int i = 0; i < halfLength; ++i) {
            swapChars(chars, start + i, end - i - 1);
        }
    }

    private static void swapChars(char[] chars, int i, int j){
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }
}