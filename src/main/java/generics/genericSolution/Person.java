package generics.genericSolution;

public class Person<T extends Shoes> {
    private Shoes shoes;

    public Person(Shoes shoes) {
        this.shoes = shoes;
    }

    public Shoes getShoes() {
        return shoes;
    }
}
