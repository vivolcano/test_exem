import java.io.*;
import java.util.*;

public class RandomNumbersInput {


    public int[] inputArr(String fileName) throws IOException {

        String str;
        List<String> list = new ArrayList<String>();
        int[] inputArr = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            while ((str = bufferedReader.readLine()) != null) {
                if (!str.isEmpty()) list.add(str);
            }

            inputArr = list.stream()
                    .mapToInt(Integer::parseInt)
                    .toArray();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return inputArr;
    }

}

