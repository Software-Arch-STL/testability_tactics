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

