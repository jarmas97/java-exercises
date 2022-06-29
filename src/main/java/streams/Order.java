package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private List<Product> productList = new ArrayList<>();

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, List<Product> productList) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.productList = productList;
    }
    public Long getId() {
        return id;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    public String getStatus() {
        return status;
    }
    public List<Product> getProductList() {
        return productList;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(deliveryDate, order.deliveryDate) &&
                Objects.equals(status, order.status) &&
                Objects.equals(productList, order.productList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, deliveryDate, status, productList);
    }
}