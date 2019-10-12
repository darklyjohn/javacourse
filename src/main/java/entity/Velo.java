package entity;

import java.util.Objects;

public class Velo {

private String brand;
private String model;

    public Velo(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Velo() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Velo velo = (Velo) o;
        return Objects.equals(brand, velo.brand) &&
                Objects.equals(model, velo.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Velo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
