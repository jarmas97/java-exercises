package generics.genericSolution;

import generics.genericSolution.shoes.Athlete;

public class FitFabric {

    public static void exercise(Athlete athlete) {
        System.out.println("Flexibility of Athlete's SportShoes is: " + athlete.getShoes().getFlexibility());
    }
}
