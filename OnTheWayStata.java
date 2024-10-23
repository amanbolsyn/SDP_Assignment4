public class OnTheWayState implements OrderState {
    @Override
    public void confirm(Order order) {
        System.out.println("Order is already confirmed.");
    }

    @Override
    public void startJourney(Order order) {
        System.out.println("Journey is already in progress.");
    }

    @Override
    public void complete(Order order) {
        System.out.println("Order completed.");
        order.setState(new FinishedState());
    }

    @Override
    public String getStatus() {
        return "On the Way";
    }
}
