package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.pratice.domain;

public class Produto {
    public String name;
    public double preco;
    public int quantidadeEmEstoque;

    public void imprimirDetalhes(){
        System.out.println("Product Name: "+name);
        System.out.println("Product price: R$"+preco);
        System.out.println("Quantity in stock: "+quantidadeEmEstoque);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        valorTotal = preco * quantidadeEmEstoque;
        return valorTotal;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEmEstoque += quantidade;
        System.out.println(this.quantidadeEmEstoque);
    }

    public void removerEstoque(int quantidade){
        this.quantidadeEmEstoque -= quantidade;
        System.out.println(this.quantidadeEmEstoque);
    }
}
