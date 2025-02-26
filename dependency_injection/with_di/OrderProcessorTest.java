public class OrderProcessorTest{
    @Test
    public void shouldProcessOrderSuccessfully() {
        // Create a test double (mock)
        PaymentGateway mockPaymentGateway = mock(PaymentGateway.class);
        when(mockPaymentGateway.processPayment(anyDouble())).thenReturn(true);
        
        // Inject the mock
        OrderProcessor processor = new OrderProcessor(mockPaymentGateway);
        
        // Test the behavior
        Order order = new Order(100.0);
        boolean result = processor.processOrder(order);
        
        assertTrue(result);
        verify(mockPaymentGateway).processPayment(100.0);
    }
}
