package academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.domain;

public class Guitar {
    final private String name = "Fender Stratocaster";
    private String color;
    private int yearOfManufacture;

    public Guitar(String color, int yearOfManufacture) {
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
