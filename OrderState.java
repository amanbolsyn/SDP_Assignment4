//State Interface
public interface OrderState {
    void confirm(Order order);
    void startJourney(Order order);
    void complete(Order order);
    String getStatus();
}
