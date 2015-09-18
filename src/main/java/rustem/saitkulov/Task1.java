package rustem.saitkulov;

public final class Task1 {

    //Constructor must be private for utils
    private Task1() {}

    public static void oddEvenSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        // initially, we believe that there is an array of evens, the index of first odd is -1
        int lastOddIndex = -1;

        for (int i = 0; i < array.length; i++) {

            // if the odds are not founded, even numbers should not be changed
            if (isOdd(array[i])) {

                // left from odd is even
                if (i - lastOddIndex > 1) {

                    // moving odd to last odds position, evens shifted to the right
                    rotatePartOfArrayRight(array, lastOddIndex + 1, i);
                }

                lastOddIndex++;
            }
        }
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    private static void rotatePartOfArrayRight(int[] array, int first, int second) {
        // small buffer array
        int[] partArray = new int[second - first + 1];
        for (int i = 0; i < partArray.length; i++) {
            partArray[i] = array[i + first];
        }

        array[first] = partArray[partArray.length - 1];
        for (int i = 1; i < partArray.length; i++) {
            array[first + i] = partArray[i - 1];
        }
    }
}