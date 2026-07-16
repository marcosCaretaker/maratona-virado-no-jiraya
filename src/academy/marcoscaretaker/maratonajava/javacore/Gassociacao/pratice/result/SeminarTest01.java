package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Local;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Seminar;

public class SeminarTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Azeitonas verdes, 192, Fruteiras - Unaí MG");
        Seminar seminar = new Seminar("Introdução ao JAVA",local);
        seminar.setLocal(local);
    }
}
