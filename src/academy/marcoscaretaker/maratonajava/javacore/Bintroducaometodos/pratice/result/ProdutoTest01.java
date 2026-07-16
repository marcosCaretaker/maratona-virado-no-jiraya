package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.pratice.domain.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.name = "Caixa de bombom";
        produto1.preco = 21;
        produto1.quantidadeEmEstoque = 10;
        System.out.println(produto1.calcularValorTotal());
        produto1.imprimirDetalhes();
        System.out.println(produto1.calcularValorTotal());
        produto1.adicionarEstoque(5);
        System.out.println(produto1.calcularValorTotal());
        produto1.removerEstoque(8);
        System.out.println(produto1.calcularValorTotal());
    }
}
