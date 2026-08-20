package academy.marcoscaretaker.maratonajava.javacore.ZZBparameterization.domain;

public class Car {
    private String name;
    private String color;
    private int year;

    public Car(String name,String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
