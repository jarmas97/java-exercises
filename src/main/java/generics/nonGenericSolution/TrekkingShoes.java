package generics.nonGenericSolution;

public class TrekkingShoes {

    private int waterproofLevel;
    private int flexibility;
    private double weight;

    public TrekkingShoes(int waterproofLevel, int flexibility, double weight) {
        this.waterproofLevel = waterproofLevel;
        this.flexibility = flexibility;
        this.weight = weight;
    }

    public int getWaterproofLevel() {
        return waterproofLevel;
    }

    public int getFlexibility() {
        return flexibility;
    }

    public double getWeight() {
        return weight;
    }
}
