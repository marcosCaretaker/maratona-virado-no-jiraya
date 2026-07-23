package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain;

public class Television extends Product{
    public static final double PERCENT_TAX = 0.21;
    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating television tax");
        return this.value * PERCENT_TAX;
    }
}
