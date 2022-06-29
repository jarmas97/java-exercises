package streams;

import java.util.Objects;

public class Customer {
    private Long id;
    private String name;
    private Integer tier;

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getTier() {
        return tier;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(tier, customer.tier);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, tier);
    }
}

