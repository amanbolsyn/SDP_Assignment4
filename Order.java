public class Order {
    private OrderState state;

    public Order() {
        state = new CreatedState(); // Initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void confirm() {
        state.confirm(this);
    }

    public void startJourney() {
        state.startJourney(this);
    }

    public void complete() {
        state.complete(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
