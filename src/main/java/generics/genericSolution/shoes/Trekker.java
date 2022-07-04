package generics.genericSolution.shoes;

import generics.genericSolution.Shoes;

public class Trekker<T extends SportShoes,C extends Clothes> extends Athlete<T,C> {

    private Clothes clothes;

    public Trekker(Shoes shoes, Clothes clothes) {
        super(shoes);
        this.clothes = clothes;
        if (this.clothes.getMinDegree() <= -10) {
            throw new IllegalArgumentException("minDegree is lower or equal -10");
        }
    }

    public Clothes getClothes() {
        return clothes;
    }
}
