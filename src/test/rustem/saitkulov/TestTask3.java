package rustem.saitkulov;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTask3 {

    @Test
    public void testReverse(){
        String s1 = "My name is Max";
        assertTrue(Task3.reverse(s1).equals("xaM si eman yM"));
        assertTrue(Task3.reverseRecursively(s1).equals("xaM si eman yM"));

        String s2 = " Max";
        assertTrue(Task3.reverse(s2).equals("xaM "));
        assertTrue(Task3.reverseRecursively(s2).equals("xaM "));

        String s3 = null;
        assertTrue(Task3.reverse(s3) == null);
        assertTrue(Task3.reverseRecursively(s3) == null);

        String s4 = "";
        assertTrue(Task3.reverse(s4).isEmpty());
        assertTrue(Task3.reverseRecursively(s4).isEmpty());
    }
}
