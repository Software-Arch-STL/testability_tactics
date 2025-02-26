public class OrderServiceTest{
    @Test
    public void orderTotalIncludesTax() {
        // Stub implementation for testing
        TaxCalculationStrategy fixedTaxCalculator = order -> 10.0;
        
        OrderService service = new OrderService(fixedTaxCalculator);
        Order order = new Order(100.0);
        
        double total = service.calculateOrderTotal(order);
        
        assertEquals(110.0, total, 0.001);
    }
}
