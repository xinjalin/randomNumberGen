import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            // Open Customers.txt read lines. then split the stored line string to an array at the comma
            File fileReadObject = new File("C:\\Users\\xin\\IdeaProjects\\randomNumberGen\\src\\customers.txt");
            Scanner fileReader = new Scanner(fileReadObject);
            while (fileReader.hasNextLine()) {
                String customerDataLine = fileReader.nextLine();
                // to check unformatted data
                // System.out.println(customerDataLine);

                String[] rawCustomerData = customerDataLine.split(",");
                System.out.println(Arrays.toString(rawCustomerData));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}