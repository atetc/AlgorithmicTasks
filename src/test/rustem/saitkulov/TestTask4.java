package rustem.saitkulov;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTask4 {

    @Test
    public void testReverse(){
        assertTrue(Task4.firstNonRepeatedChar("My name is Max") == 'y');
        assertTrue(Task4.firstNonRepeatedChar("bbbb") == null);
        assertTrue(Task4.firstNonRepeatedChar("") == null);
        assertTrue(Task4.firstNonRepeatedChar(null) == null);
        assertTrue(Task4.firstNonRepeatedChar("a") == 'a');
    }
}
