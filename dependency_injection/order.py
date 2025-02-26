public class OrderProcessor {
    private PaymentGateway paymentGateway;
    
    public OrderProcessor() {
        // Hard-coded dependency creation
        this.paymentGateway = new RealPaymentGateway();
    }
    
    public boolean processOrder(Order order) {
        // Use payment gateway to process payment
        return paymentGateway.processPayment(order.getTotal());
    }
}

public class OrderProcessor {
    private final PaymentGateway paymentGateway;
    
    public OrderProcessor(PaymentGateway paymentGateway) {
        // Dependency injected through constructor
        this.paymentGateway = paymentGateway;
    }
    
    public boolean processOrder(Order order) {
        return paymentGateway.processPayment(order.getTotal());
    }
}

