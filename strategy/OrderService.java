// Class using strategy
public class OrderService {
    private final TaxCalculationStrategy taxCalculator;
    
    public OrderService(TaxCalculationStrategy taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
    
    public double calculateOrderTotal(Order order) {
        double subtotal = order.getSubtotal();
        double tax = taxCalculator.calculateTax(order);
        return subtotal + tax;
    }
}
