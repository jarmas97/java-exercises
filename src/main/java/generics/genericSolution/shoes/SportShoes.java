package generics.genericSolution.shoes;

import generics.genericSolution.Shoes;

public class SportShoes extends Shoes {

    private int flexibility;

    public SportShoes(double weight, int flexibility) {
        super(weight);
        this.flexibility = flexibility;
    }

    public int getFlexibility() {
        return flexibility;
    }
}
