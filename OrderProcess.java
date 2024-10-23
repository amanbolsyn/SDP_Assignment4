// Abstract Class
public abstract class OrderProcess {
    // Template method
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    protected abstract void checkAvailability();

    protected abstract void calculateCost();

    protected void confirmOrder() {
        System.out.println("Order confirmed.");
    }
}
