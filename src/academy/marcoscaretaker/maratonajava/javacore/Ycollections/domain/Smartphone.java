package academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String brand;
    private String model;

    public Smartphone(String serialNumber, String brand, String model) {
        Objects.requireNonNull(serialNumber);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(model);
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode().
    // y.hashCode() == x.hashCode() The y.equals(x) method does not necessarily have to return true.
    // x.equals(y) == false.
    // y.hashCode() != x.hashCode() x.equals(y) should be false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
