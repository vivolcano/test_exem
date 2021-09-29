public class SortArrays {

    // Сортировка "пузырьком"
    public int[] bubbleSort(int[] array) {

        long startSort = System.currentTimeMillis();

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        int timeToSort = (int) (System.currentTimeMillis() - startSort);
        System.out.println("bubble sorting completed in " + timeToSort + " ms" );

        return array;
    }


    // Сортировка выбором
    public int[] selectionSort(int[] array) {

        long startSort = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

        int timeToSort = (int) (System.currentTimeMillis() - startSort);
        System.out.println("selection sorting completed in " + timeToSort + " ms" );

        return array;
    }

    // Сортировка вставками
    public int[] insertionSort(int[] array) {

        long startSort = System.currentTimeMillis();

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;
        }

        int timeToSort = (int) (System.currentTimeMillis() - startSort);
        System.out.println("insertion sorting completed in " + timeToSort + " ms" );

        return array;
    }
}
