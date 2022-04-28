import java.util.Arrays;

public class SpareParts {
    int[] sparePartSerialNumber;
    boolean sparePartGenuine;
    String sparePartName;
    public SpareParts(int[] sparePartSerialNumber, boolean sparePartGenuine, String sparePartName) {
        this.sparePartSerialNumber = sparePartSerialNumber;
        this.sparePartGenuine = sparePartGenuine;
        this.sparePartName = sparePartName;
    }
    @Override
    public String toString() {
        String serialNumber = Arrays.toString(sparePartSerialNumber);
        String genuine = String.valueOf(sparePartGenuine);
        return "Serial Number: "+serialNumber+"\nIs the Part Genuine: "+genuine+"\nSpare Part Name: "+sparePartName;
    }
}
