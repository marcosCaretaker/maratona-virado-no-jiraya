package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.pratice;

public class PagamentoPix extends Pagamento{
    private final GeradorIDS CHAVE_PIX = new GeradorIDS();

    public PagamentoPix(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public void autorizar() {
        System.out.println("Validando chave Pix["+CHAVE_PIX.gerarID()+"]...Pagamento de R$"+this.valorTotal+" autorizado instantaneamente.");
    }
}
