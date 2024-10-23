// Example Usage
public class Main {
    public static void main(String[] args) {
        // Distance-based pricing
        PricingStrategy distanceStrategy = new DistancePricingStrategy(2.5); // $2.5 per mile
        Trip trip1 = new Trip(distanceStrategy);
        double distanceCost = trip1.calculateCost(10); // 10 miles
        System.out.println("Distance-based trip cost: $" + distanceCost);

        // Time-based pricing
        PricingStrategy timeStrategy = new TimePricingStrategy(0.5); // $0.5 per minute
        Trip trip2 = new Trip(timeStrategy);
        double timeCost = trip2.calculateCost(30); // 30 minutes
        System.out.println("Time-based trip cost: $" + timeCost);

        // Fixed price pricing
        PricingStrategy fixedPriceStrategy = new FixedPricePricingStrategy(15.0); // $15 fixed price
        Trip trip3 = new Trip(fixedPriceStrategy);
        double fixedCost = trip3.calculateCost(0); // value is irrelevant here
        System.out.println("Fixed price trip cost: $" + fixedCost);
    }
}
