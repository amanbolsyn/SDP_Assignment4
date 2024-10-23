// Concrete Strategy for distance-based pricing
public class DistancePricingStrategy implements PricingStrategy {
    private double ratePerMile;

    public DistancePricingStrategy(double ratePerMile) {
        this.ratePerMile = ratePerMile;
    }

    @Override
    public double calculateCost(double distance) {
        return ratePerMile * distance;
    }
}
