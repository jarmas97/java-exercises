package designPatterns.factory;

public class StrawberryIcecream implements Icecream {

    private String name;
    private int calories;
    private double price;

    public StrawberryIcecream(int calories, double price) {
        this.name = "Strawberry Icecream";
        this.calories = calories;
        this.price = price;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "StrawberryIcecream{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
