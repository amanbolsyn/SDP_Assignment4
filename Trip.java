// Context
public class Trip {
    private PricingStrategy pricingStrategy;

    public Trip(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateCost(double value) {
        return pricingStrategy.calculateCost(value);
    }
}
