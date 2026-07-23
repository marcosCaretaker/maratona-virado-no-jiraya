package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product{
    public static final double PERCENT_TAX = 0.11;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax(){
        System.out.println("Calculating tomato tax");
        return this.value * PERCENT_TAX;
    }
}
