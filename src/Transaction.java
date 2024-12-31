public class Transaction extends Order {
    private String paymentMethod; // New property specific to Transaction
    private String transactionStatus; // New property specific to Transaction

    // Valid payment methods
    private static final String[] VALID_PAYMENT = {"credit", "debit", "paypal", "apple", "google"};

    // Constructor for Transaction
    public Transaction(String orderId, String customerId, String item, int quantity, double price, String paymentMethod) {
        super(orderId, customerId, item, quantity, price); // Call to parent class constructor
        validatePaymentMethod(paymentMethod);
        processTransaction();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void validatePaymentMethod(String paymentMethod) {
        // Validate payment method against the list of valid payment methods
        for (String payment_type : VALID_PAYMENT) {
            if (paymentMethod.toLowerCase().equals(payment_type)) {
                this.paymentMethod = paymentMethod;
                return;
            }
        }
//        if we reach end of loop, no match, throw error
        throw new IllegalArgumentException("\nInvalid payment method. Allowed values: credit, debit, paypal, apple, google.");
    }

    public void processTransaction() {
//        first ensure valid payment method has been provided
        if (this.paymentMethod == null) {
            throw new IllegalStateException("\nPayment method must be set before processing the transaction.");
        }
//        if its not null, we have a valid payment method, approve transaction
        this.transactionStatus = "completed";
    }
}
