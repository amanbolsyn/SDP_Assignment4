public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Current status: " + order.getStatus());

        order.confirm();
        System.out.println("Current status: " + order.getStatus());

        order.startJourney();
        System.out.println("Current status: " + order.getStatus());

        order.complete();
        System.out.println("Current status: " + order.getStatus());
    }
}
