package designPatterns.builder;

import java.util.Date;

public class Car {
    private long id;
    private Date dateOfProduction;
    private String vinNumber;
    private String brand;
    private String model;
    private String colour;

    public long getId() {
        return id;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public String getVinNumber() {
        return vinNumber;
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

    @Override
    public String toString() {
        return "Builder{" +
                "id=" + id +
                ", dateOfProduction=" + dateOfProduction +
                ", vinNumber='" + vinNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static final class Builder {
        private long id;
        private Date dateOfProduction;
        private String vinNumber;
        private String brand;
        private String model;
        private String colour;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder dateOfProduction(Date dateOfProduction) {
            this.dateOfProduction = dateOfProduction;
            return this;
        }

        public Builder vinNumber(String vinNumber) {
            this.vinNumber = vinNumber;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.id = this.id;
            car.dateOfProduction = this.dateOfProduction;
            car.vinNumber = this.vinNumber;
            car.brand = this.brand;
            car.model = this.model;
            car.colour = this.colour;
            return car;
        }
    }
}
