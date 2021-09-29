import java.io.IOException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        RandomNumbersOutput randomNumbersOutput = new RandomNumbersOutput();
        randomNumbersOutput.OutputArr("data.txt");

        int[] arr = new RandomNumbersInput().inputArr("data.txt");

        new SortArrays().bubbleSort(arr);
        new SortArrays().selectionSort(arr);
        new SortArrays().insertionSort(arr);

    }
}
