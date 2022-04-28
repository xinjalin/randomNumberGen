import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenuineCheck {
        public static void main(String[] args) {
                Scanner scannerObject = getScanner();                     // Scanner with method call to create

                System.out.println("Enter Customer Name: ");              // Prompt user to input Customer Name
                String customerNameInput = scannerObject.nextLine();      // Read user input
                System.out.println("Enter Customer ID: ");
                String customerIDInput = scannerObject.nextLine();
                System.out.println("Enter Customer Payment type either card or cash: ");
                String customerPaymentType = scannerObject.nextLine();
                scannerObject.close();                                    // Closes scanner


                CustomerObject customerTemp = new CustomerObject(Integer.parseInt(customerIDInput), customerNameInput, customerPaymentType);
                System.out.println(customerTemp);                         // Output user input






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

        private static Scanner getScanner() {
                return new Scanner(System.in);
        }
}
