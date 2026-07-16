package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main;

public class Local {
    private String adress;
    private Seminar seminar;


    public Local(String adress) {
        this.adress = adress;
    }

    public Local(String adress, Seminar seminar) {
        this.adress = adress;
        this.seminar = seminar;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
