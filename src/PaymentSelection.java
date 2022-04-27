public class PaymentSelection {
    String paymentCard = "card";
    String paymentCash = "cash";
    String paymentError = "error";

    public PaymentSelection(String paymentChoice) {
        if (paymentChoice.equals(paymentCard)) {
            paymentChoice = paymentCard;
        } else if (paymentChoice.equals(paymentCash)) {
            paymentChoice = paymentCash;
        }else{
            paymentChoice = paymentError;
        }
    }
}
