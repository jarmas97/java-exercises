package generics.genericSolution.shoes;

public class RunningShoes extends SportShoes {

    private int amortization;

    public RunningShoes(double weight, int flexibility, int amortization) {
        super(weight, flexibility);
        this.amortization = amortization;
    }

    public int getAmortization() {
        return amortization;
    }
}
