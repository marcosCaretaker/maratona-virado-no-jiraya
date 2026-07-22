package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.pratice;

public abstract class Pagamento {
    protected GeradorIDS idTransacao = new GeradorIDS();
    protected double valorTotal;
    private int id;

    public Pagamento(double valorTotal) {
        this.id = idTransacao.gerarID();
        this.valorTotal = valorTotal;
    }

    public void gerarComprovante(){
        System.out.println("Comprovante da transação ID:"+this.id+" no valor de R$"+valorTotal+".");
    }
    public abstract void autorizar();
}
