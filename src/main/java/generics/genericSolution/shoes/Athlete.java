package generics.genericSolution.shoes;

import generics.genericSolution.Person;
import generics.genericSolution.Shoes;

public class Athlete<T extends SportShoes, C extends Clothes> extends Person<T> {

    private SportShoes sportShoes;

    public Athlete(Shoes shoes) {
        super(shoes);
        this.sportShoes = (SportShoes) shoes;
    }

    @Override
    public SportShoes getShoes() {
        return this.sportShoes;
    }
}
