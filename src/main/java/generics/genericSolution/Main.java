package generics.genericSolution;

import generics.genericSolution.shoes.*;

public class Main {
    public static void main(String[] args) {

        Athlete<TrekkingShoes, Clothes> athlete = new Athlete<>(new TrekkingShoes(2.3, 9, 8));
        System.out.println("TREKKING SHOES WEIGHT: " + athlete.getShoes().getWeight());

        Person<RunningShoes> runner = new Person<>(new RunningShoes(1.2, 8, 9));
        System.out.println("RUNNING SHOES WEIGHT: " + runner.getShoes().getWeight());

        Person<Hills> model = new Person<>(new Hills(2.0, 4));
        System.out.println("HILLS WEIGHT: " + model.getShoes().getWeight());

        FitFabric.exercise(athlete);

        Athlete<TrekkingShoes, Clothes> trekker =
                new Trekker<>(new TrekkingShoes(2.3, 9, 8), new Clothes(-10, 4));
    }
}
