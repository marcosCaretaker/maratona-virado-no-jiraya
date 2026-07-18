package academy.marcoscaretaker.maratonajava.javacore.Jmodificadofinal.domain;

public class Car {
    private String name;
    private static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public static double getSpeedLimit() {
        return SPEED_LIMIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
