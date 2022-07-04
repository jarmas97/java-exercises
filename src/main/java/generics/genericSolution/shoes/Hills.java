package generics.genericSolution.shoes;

import generics.genericSolution.Shoes;

public class Hills extends Shoes {

    private int dimesion;

    public Hills(double weight, int dimesion) {
        super(weight);
        this.dimesion = dimesion;
    }

    public int getDimesion() {
        return dimesion;
    }
}
