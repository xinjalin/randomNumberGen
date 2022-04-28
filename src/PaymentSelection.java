public class PaymentSelection {
    String paymentCard = "card";
    String paymentCash = "cash";
    String paymentError = "error";
    String paymentChoice;


    public PaymentSelection(String paymentChoice) {
        switch (paymentChoice) {
            case "card" -> this.paymentChoice = paymentCard;
            case "cash" -> this.paymentChoice = paymentCash;
            default -> this.paymentChoice = paymentError;
        }
    }
    @Override
    public String toString() {
        return paymentChoice;
    }
}
