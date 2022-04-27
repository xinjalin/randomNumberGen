import java.util.Arrays;

public class SpareParts {
    int[] sparePartSerialNumber;
    boolean sparePartGenunine;
    String sparePartName;
    public SpareParts(int[] sparePartSerialNumber, boolean sparePartGenuine, String sparePartName) {
        this.sparePartSerialNumber = sparePartSerialNumber;
        this.sparePartGenunine = sparePartGenuine;
        this.sparePartName = sparePartName;
    }
    @Override
    public String toString() {
        String serialNumber = Arrays.toString(sparePartSerialNumber);
        String genuine = String.valueOf(sparePartGenunine);
        return "Serial Number:"+serialNumber+" Is the Part Genuine:"+genuine+" Spare Part Name:"+sparePartName;
    }
}
