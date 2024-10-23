public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        order.attach(client1);
        order.attach(client2);

        order.setStatus("Confirmed");
        order.setTaxiArriving(true);
        order.setStatus("Completed");
    }
}
