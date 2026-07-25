package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product{
    public static final double PERCENT_TAX = 0.11;
    private String expirationDate;

    public Tomato(String name, double value) {
        super(name, value);
    }


    @Override
    public double calculateTax(){
        System.out.println("Calculating tomato tax");
        return this.value * PERCENT_TAX;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
