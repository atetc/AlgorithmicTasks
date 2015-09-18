package rustem.saitkulov;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestTask1 {

    @Test
    public void testSort(){
        int[] array1 = {3, 2, 1, 0};
        Task1.oddEvenSort(array1);
        assertTrue(array1[0] == 3);
        assertTrue(array1[1] == 1);
        assertTrue(array1[2] == 2);
        assertTrue(array1[3] == 0);

        int[] array2 = {2, 2, -2, 1};
        Task1.oddEvenSort(array2);
        assertTrue(array2[0] == 1);
        assertTrue(array2[1] == 2);
        assertTrue(array2[2] == 2);
        assertTrue(array2[3] == -2);

        int[] array3 = new int[2];
        Task1.oddEvenSort(array3);
        assertTrue(array3[0] == 0);

        int[] array4 = null;
        Task1.oddEvenSort(array4);
        assertTrue(array4 == null);

        int[] array5 = {2, 2, 2};
        Task1.oddEvenSort(array5);
        assertTrue(array5[0] == 2);
        assertTrue(array5[1] == 2);
        assertTrue(array5[2] == 2);
    }
}