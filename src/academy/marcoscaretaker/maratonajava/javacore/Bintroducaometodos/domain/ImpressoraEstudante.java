package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante){
        System.out.println("----------------");
        System.out.println("Nome: "+estudante.name+" com "+estudante.age+" anos do sexo "+estudante.sex+".");
    }
}
