package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.pratice;

public class SistemaCheckout {
    public static void main(String[] args) {
        PagamentoPix calcaJeans = new PagamentoPix(345);
        calcaJeans.gerarComprovante();
        calcaJeans.autorizar();
        PagamentoCartao bolsaDeCouro = new PagamentoCartao(567);
        bolsaDeCouro.gerarComprovante();
        bolsaDeCouro.autorizar();

    }
}
