// Concrete Class
public class TaxiOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        // Simulate availability check
        System.out.println("Checking availability of taxis...");
        // Here you could implement actual availability logic
        System.out.println("Taxis are available.");
    }

    @Override
    protected void calculateCost() {
        // Simulate cost calculation
        double distance = 10; // Example distance in miles
        double cost = distance * 2.5; // $2.5 per mile
        System.out.println("Calculated cost: $" + cost);
    }

    @Override
    protected void confirmOrder() {
        // Optionally override to add custom confirmation logic
        System.out.println("Sending confirmation message...");
        super.confirmOrder(); // Call the default confirmation
    }
}
