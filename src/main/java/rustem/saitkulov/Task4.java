package rustem.saitkulov;

import java.util.LinkedHashSet;
import java.util.Set;

public final class Task4 {

    //Constructor must be private for utils
    private Task4() {}

    public static Character firstNonRepeatedChar(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        char[] charArray = s.toCharArray();

        Set<Character> chSet = new LinkedHashSet<Character>();
        for (char charItem : charArray) {
            if (!chSet.add(charItem)) {
                chSet.remove(charItem);
            }
        }

        if (chSet.isEmpty()) {
            return null;
        } else {
            return (Character) (chSet.toArray())[0];
        }
    }
}