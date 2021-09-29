import java.io.*;
import java.util.*;


public class RandomNumbersOutput {

    // save in array in txt file
    public void OutputArr(String nameFile) throws IOException {

        int [] arr = createRandomArr();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(nameFile)))) {
            for (int i : arr) {
                bufferedWriter.write(String.valueOf(i));
                bufferedWriter.write("\n");
            }
            bufferedWriter.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // create random array
    public int [] createRandomArr() {

        int [] randomArray = new int[1_000_000];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++)
            randomArray[i] = random.nextInt(1_000_000);

        return randomArray;
    }

}
