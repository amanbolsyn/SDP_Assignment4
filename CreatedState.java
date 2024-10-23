public class CreatedState implements OrderState {
    @Override
    public void confirm(Order order) {
        System.out.println("Order confirmed.");
        order.setState(new ConfirmedState());
    }

    @Override
    public void startJourney(Order order) {
        System.out.println("Order cannot start. Please confirm the order first.");
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order cannot be completed. Please confirm first.");
    }

    @Override
    public String getStatus() {
        return "Created";
    }
}
