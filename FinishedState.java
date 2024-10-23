public class FinishedState implements OrderState {
    @Override
    public void confirm(Order order) {
        System.out.println("Order cannot be confirmed. It is already completed.");
    }

    @Override
    public void startJourney(Order order) {
        System.out.println("Order cannot start. It is already completed.");
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order is already completed.");
    }

    @Override
    public String getStatus() {
        return "Completed";
    }
}
