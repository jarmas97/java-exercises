package streams.user;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private long id;
    private String brand;
    private String model;
    private String colour;
    private BigDecimal price;

    public Car(long id, String brand, String model, String colour, BigDecimal price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, colour, price);
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand='" + brand + '\'' + ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
