package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.name = "Tanjiro";
        estudante1.age = 21;
        estudante1.sex = 'M';

        estudante2.name = "Nezuko";
        estudante2.age = 18;
        estudante2.sex = 'F';

        estudante3.name = "Stranger";
        estudante3.age = 32;
        estudante3.sex = 'M';

        impressora.imprimir(estudante1);
        impressora.imprimir(estudante2);
        impressora.imprimir(estudante3);
    }
}
