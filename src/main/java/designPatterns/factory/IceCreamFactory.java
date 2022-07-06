package designPatterns.factory;

public class IceCreamFactory {

    public static Icecream createIcecream(IcecreamType type) {
        if (type.equals(IcecreamType.STRAWBERRY)) {
            return new StrawberryIcecream(320, 4.0);
        } else if (type.equals(IcecreamType.CHOCOLATE)) {
            return new ChocolateIcecream(490, 5.1);
        } else {
            throw new IllegalStateException("Unexpected value: " + type);
        }
    }

}
