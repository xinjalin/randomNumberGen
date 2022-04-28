import java.util.Arrays;
import java.util.Random;

public class GenuineCheck {
        public static void main(String[] args) {
        Random r = new Random();
        int randomNumberStart = 10000;
        int randomNumberEnd = 99999;
        int size = 1;
        int[] numberGen = r.ints(randomNumberStart, randomNumberEnd)
                .distinct()
                .limit(size)
                .toArray();

        // name of spare part
        String nameOfPart = "car horn";

        SpareParts orderOne = new SpareParts(numberGen, true, nameOfPart);


        System.out.println(Arrays.toString(orderOne.sparePartSerialNumber));
        System.out.println(orderOne.sparePartGenunine);
        System.out.println(orderOne.sparePartName);
        System.out.println(orderOne);

        // payment options card or cash
        String paymentType = "cash";

        PaymentSelection selection = new PaymentSelection(paymentType);


        System.out.println(selection);


    }
}
