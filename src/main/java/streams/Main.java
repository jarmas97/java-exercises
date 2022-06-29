package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//      Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100

        List<Product> productList = new ArrayList<>();
        productList.add(new Product((long) 1, "Troy", "Books", 240.0));
        productList.add(new Product((long) 2, "300", "Books", 290.0));
        productList.add(new Product((long) 3, "Harry Potter", "books", 89.0));
        productList.add(new Product((long) 4, "Harry Potter:Puzzle", "Puzzles", 110.0));

        List<Product> result = productList.stream().filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());
        for (Product product : result) {
            System.out.println(product);
        }

//      Exercise 2 — Obtain a list of order with products belong to category “Baby”


    }
}
