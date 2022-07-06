package designPatterns.builder;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder()
                .id(0)
                .dateOfProduction(new Date(2022, 7, 5))
                .vinNumber("WVGZZZ5NZJM131395")
                .brand("Mercedes")
                .model("GLC SUV")
                .colour("BLUE")
                .build();
        Car car1 = new Car.Builder()
                .brand("BWM")
                .colour("BLACK")
                .build();

        System.out.println(car);
        System.out.println(car1);
    }
}
