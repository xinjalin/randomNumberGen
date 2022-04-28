import java.util.Arrays;
import java.util.Random;

public class SerialNumberGenerator {


    public static int[] addToArray(int n, int[] numberArrayDatabase, int numberGenNew){
        int i;

        int[] resultArray = new int[n + 1];

        for (i = 0; i < n; i++)
            resultArray[i] = numberArrayDatabase[i];

        resultArray[n] = numberGenNew;

        return resultArray;
    }


    public static void main(String[] args) {
        Random r = new Random();
        int randomNumberStart = 10000;
        int randomNumberEnd = 99999;
        int size = 1;
        int[] unique = new int[0];

        int n = 10;
        for (int i = 0; i < n; i++){
            int[] numberGen = r.ints(randomNumberStart, randomNumberEnd)
                    .distinct()
                    .limit(size)
                    .toArray();

            unique = addToArray(unique.length, unique, numberGen[0]);
        }
        System.out.println(Arrays.toString(unique));
    }
}