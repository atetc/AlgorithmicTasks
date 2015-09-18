package rustem.saitkulov;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTask2 {

    @Test
    public void testReverseWords(){
        String s1 = "My name is Max";
        assertTrue(Task2.reverseWords(s1).equals("Max is name My"));

        String s2 = "My";
        assertTrue(Task2.reverseWords(s2).equals("My"));

        String s3 = null;
        assertTrue(Task2.reverseWords(s3) == null);

        String s4 = "";
        assertTrue(Task2.reverseWords(s4) == "");
    }
}
