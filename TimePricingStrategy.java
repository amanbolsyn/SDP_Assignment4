// Concrete Strategy for time-based pricing
public class TimePricingStrategy implements PricingStrategy {
    private double ratePerMinute;

    public TimePricingStrategy(double ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    @Override
    public double calculateCost(double time) {
        return ratePerMinute * time;
    }
}
