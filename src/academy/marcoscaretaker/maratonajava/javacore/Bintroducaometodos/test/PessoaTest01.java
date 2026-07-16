package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Itadori");
        pessoa.setIdade(19);
        pessoa.imprime();
        System.out.println("================");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
