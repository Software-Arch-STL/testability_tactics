public class OrderProcessor {
    private PaymentGateway paymentGateway;
    
    public OrderProcessor() {
        // Hard-coded dependency creation
        this.paymentGateway = new RealPaymentGateway();
    }
    
    public boolean processOrder(Order order) {
        return paymentGateway.processPayment(order.getTotal());
    }
}
