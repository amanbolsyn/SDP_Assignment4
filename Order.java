import java.util.ArrayList;
import java.util.List;

// Subject
public class Order {
    private List<Client> observers = new ArrayList<>();
    private String status = "Pending";
    private boolean taxiArriving = false;

    public void attach(Client client) {
        observers.add(client);
    }

    public void detach(Client client) {
        observers.remove(client);
    }

    public void notifyObservers() {
        for (Client observer : observers) {
            observer.update(this);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public boolean isTaxiArriving() {
        return taxiArriving;
    }

    public void setTaxiArriving(boolean taxiArriving) {
        this.taxiArriving = taxiArriving;
        notifyObservers();
    }
}
