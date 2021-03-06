package streams;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Product bookTroy240 = new Product((long) 1, "Troy", "Books", 240.0);
        Product book300290 = new Product((long) 2, "300", "Books", 290.0);
        Product bookHarryPotter89 = new Product((long) 3, "Harry Potter", "books", 89.0);
        Product puzzleHarryPotter110 = new Product((long) 4, "Harry Potter:Puzzle", "Puzzles", 110.0);
        Product toySpiderman320 = new Product((long) 5, "Spiderman", "Toy", 320.0);
        Product toyBatman349 = new Product((long) 6, "Batman", "Toy", 349.0);
        Product toySuperman290 = new Product((long) 7, "Superman", "Toy", 290.0);

        List<Product> products0 = new ArrayList<>();
        products0.add(bookTroy240);
        products0.add(book300290);
        products0.add(bookHarryPotter89);
        products0.add(puzzleHarryPotter110);
        products0.add(toyBatman349);
        products0.add(toySpiderman320);
        products0.add(toySuperman290);

        Product babyGloves45 = new Product((long) 5, "Gloves", "baby", 45.0);
        Product babyPinkClothes35 = new Product((long) 6, "PinkClothes", "baby", 35.0);
        Product babyBoots97 = new Product((long) 7, "Boots", "baby", 97.0);

        List<Product> products1 = new ArrayList<>();
        products1.add(babyGloves45);
        products1.add(babyPinkClothes35);
        products1.add(babyBoots97);

        Order order0 = new Order(
                (long) 1,
                LocalDate.of(2022, 6, 20),
                LocalDate.of(2022, 6, 29),
                "DONE", products0
        );
        Order order1 = new Order(
                (long) 2,
                LocalDate.of(2022, 6, 21),
                LocalDate.of(2022, 6, 29),
                "DONE", products1
        );

        List<Order> orders0 = new ArrayList<>();
        orders0.add(order0);
        orders0.add(order1);


//      Exercise 1 ??? Obtain a list of products belongs to category ???Books??? with price > 100

        List<Product> result0 = products0.stream().filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());
        for (Product product : result0) {
            System.out.println(product);
        }

//      Exercise 2 ??? Obtain a list of order with products belong to category ???Baby???

        List<Order> result1 = orders0
                .stream()
                .filter(order -> order.getProductList()
                        .stream()
                        .anyMatch(product -> product.getCategory().equalsIgnoreCase("baby"))
                )
                .collect(Collectors.toList());
        for (Order order : result1) {
            System.out.println(order.getProductList());
        }

//      Exercise 3 ??? Obtain a list of product with category = ???Toys??? and then apply 10% discount
        List<Product> result2 = products0.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("toys"))
                .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice() * 0.9))
                .collect(Collectors.toList());

//----------------------------------------------------------------------------------------------------
//      Stream training:

        String[] animals = {"Monkey", "Lemur", "Lion", "Giraffe"};
        List<String> result = Arrays.stream(animals).filter(a -> a.startsWith("L"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
