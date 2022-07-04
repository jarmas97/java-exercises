package generics.genericSolution.shoes;

public class TrekkingShoes extends SportShoes {

    private int waterpfoorLevel;

    public TrekkingShoes(double weight, int flexibility, int waterpfoorLevel) {
        super(weight, flexibility);
        this.waterpfoorLevel = waterpfoorLevel;
    }

    public int getWaterpfoorLevel() {
        return waterpfoorLevel;
    }
}
