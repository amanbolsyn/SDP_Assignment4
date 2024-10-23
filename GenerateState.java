public class ConfirmedState implements OrderState {
    @Override
    public void confirm(Order order) {
        System.out.println("Order is already confirmed.");
    }

    @Override
    public void startJourney(Order order) {
        System.out.println("Journey started.");
        order.setState(new OnTheWayState());
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order cannot be completed. Journey not started yet.");
    }

    @Override
    public String getStatus() {
        return "Confirmed";
    }
}
