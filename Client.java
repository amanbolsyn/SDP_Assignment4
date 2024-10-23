public class Client { //observer
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void update(Order order) {
        if (order.isTaxiArriving()) {
            System.out.println(name + ": Your taxi is on the way!");
        }
        System.out.println(name + ": Order status changed to '" + order.getStatus() + "'.");
    }
}
