// Concrete Strategy for fixed price
public class FixedPricePricingStrategy implements PricingStrategy {
    private double fixedPrice;

    public FixedPricePricingStrategy(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculateCost(double value) {
        return fixedPrice;
    }
}
