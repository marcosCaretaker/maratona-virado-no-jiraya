package academy.marcoscaretaker.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04A {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000

        float valorMinimoParcela = 1000;
        float valorCarroInicial = 33070;
        float valorParcela = 0;
        int quantidadeParcelas = 0;
        while (true) {
            quantidadeParcelas++;
            if (valorCarroInicial >= valorMinimoParcela) {
                valorParcela = valorCarroInicial / quantidadeParcelas;
                if (valorParcela < valorMinimoParcela) {
                    break;
                }
                System.out.println("Parcela " + quantidadeParcelas + " valor R$" + valorParcela);
            }else{
                System.out.println("Valor do carro menor do que a parcela.");
                break;
            }
        }

    }
}
