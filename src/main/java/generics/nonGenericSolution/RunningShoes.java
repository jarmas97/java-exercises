package generics.nonGenericSolution;

public class RunningShoes {
    private int amortizationLevel;
    private int flexibility;
    private double weight;

    public RunningShoes(int amortizationLevel, int flexibility, double weight) {
        this.amortizationLevel = amortizationLevel;
        this.flexibility = flexibility;
        this.weight = weight;
    }

    public int getAmortizationLevel() {
        return amortizationLevel;
    }

    public int getFlexibility() {
        return flexibility;
    }

    public double getWeight() {
        return weight;
    }
}
