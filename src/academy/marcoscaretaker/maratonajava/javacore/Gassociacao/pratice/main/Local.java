package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main;

public class Local {
    private String address;
    private Seminar seminar;


    public Local(String address) {
        this.address = address;
    }

    public Local(String address, Seminar seminar) {
        this.address = address;
        this.seminar = seminar;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
