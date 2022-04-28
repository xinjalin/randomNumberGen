public class CustomerObject {
    int customerID;
    String customerName;
    String customerPaymentType;

    public CustomerObject(int customerID, String customerName, String customerPaymentType){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPaymentType = customerPaymentType;
    }
    @Override
    public String toString() {
        String customerIDNumber = String.valueOf(customerID);
        return "Customer ID: "+customerIDNumber+"\nCustomer Name: "+customerName+"\nCustomer Payment Type: "+ customerPaymentType;
    }


}
