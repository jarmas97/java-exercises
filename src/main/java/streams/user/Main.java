package streams.user;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Car redLamboAvntdr = new Car(0, "LAMBORGHINI","AVENTADOR", "RED", new BigDecimal(573966));
        Car blueLamboHrcn = new Car(1, "LAMBORGHINI","HURACAN", "BLUE", new BigDecimal(206295));
        Car greenLamboUrus = new Car(2, "LAMBORGHINI","URUS", "GREEN", new BigDecimal(229495));

        Car silverMercSuv = new Car(3, "MERCEDES", "GLC SUV", "SILVER", new BigDecimal(66500));
        Car blackMercAMGGTR = new Car(4, "MERCEDES", "AMG GT R", "BLACK", new BigDecimal(157500));
        
        Car blackBMWM240i = new Car(5, "BMW", "M240i xDrive Coupé", "BLACK", new BigDecimal(59955));
        Car redBMWi4R50 = new Car(6, "BMW", "i4 R50", "RED", new BigDecimal(63905));


        List<Car> allCarsInDollars = new ArrayList<>();
        allCarsInDollars.add(redLamboAvntdr);
        allCarsInDollars.add(blueLamboHrcn);
        allCarsInDollars.add(greenLamboUrus);

        allCarsInDollars.add(silverMercSuv);
        allCarsInDollars.add(blackMercAMGGTR);
        
        allCarsInDollars.add(blackBMWM240i);
        allCarsInDollars.add(redBMWi4R50);


//        1. Creating list with only lambo cars-------------------------------------------------------------

        List<Car> lamboCars = allCarsInDollars.stream()
                .filter(car -> car.getBrand().equalsIgnoreCase("LAMBORGHINI"))
                .collect(Collectors.toList());
        System.out.println(lamboCars);

//        2. Changing price from dollars toPLN--------------------------------------------------------------


//        THIS CHANGES THE SOURCE

//        List<Car> allCarsInPLN = allCarsInDollars.stream()
//                .peek(car -> car.setPrice(car.getPrice().multiply(BigDecimal.valueOf(4.5))))
//                .collect(Collectors.toList());

//        THIS DOES NOT CHANGE THE SOURCE

        List<Car> allCarsInPLN = allCarsInDollars.stream()
                .map(c -> new Car(c.getId(),
                        c.getBrand(),
                        c.getModel(),
                        c.getColour(),
                        c.getPrice().multiply(BigDecimal.valueOf(4.5))))
                .collect(Collectors.toList());

        System.out.println(allCarsInPLN);
        System.out.println(allCarsInDollars);


//        Changing price from dollars to PLN with only black cars
        List<Car> blackCarsInPLN = allCarsInDollars.stream()
                .filter(car -> car.getColour().equalsIgnoreCase("black"))
                .map(c -> new Car(c.getId(),
                        c.getBrand(),
                        c.getModel(),
                        c.getColour(),
                        c.getPrice().multiply(BigDecimal.valueOf(4.5))))
                .collect(Collectors.toList());
        System.out.println(blackCarsInPLN);
    }
}
