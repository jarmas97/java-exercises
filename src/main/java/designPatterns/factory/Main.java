package designPatterns.factory;

public class Main {

    public static void main(String[] args) {
        Icecream chocoIcecream = IceCreamFactory.createIcecream(IcecreamType.CHOCOLATE);
        Icecream strawberryIcecream = IceCreamFactory.createIcecream(IcecreamType.STRAWBERRY);
        System.out.println(chocoIcecream);
        System.out.println(strawberryIcecream);
    }
}
