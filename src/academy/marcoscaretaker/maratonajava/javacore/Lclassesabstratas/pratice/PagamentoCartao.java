package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.pratice;

public class PagamentoCartao extends Pagamento{
    private GeradorIDS numeroCartao = new GeradorIDS();
    private int ultimos4;
    public PagamentoCartao(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public void autorizar() {
        ultimos4 = numeroCartao.gerarID() % 10000;
        System.out.println("Enviando dados do cartão final "+ultimos4+" para a operadora... Pagamento de R$"+this.valorTotal+" aprovado!");
    }
}
