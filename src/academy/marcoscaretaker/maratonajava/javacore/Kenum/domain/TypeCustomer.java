package academy.marcoscaretaker.maratonajava.javacore.Kenum.domain;

public enum TypeCustomer {
    INDIVIDUAL(1,"Individual"),
    CORPORATE(2,"Corporate");

    private final int value;
    private final String personReport;

    TypeCustomer(int value, String personReport){
        this.value = value;
        this.personReport = personReport;
    }

    public int getValue() {
        return value;
    }

    public String getPersonReport() {
        return personReport;
    }
}
