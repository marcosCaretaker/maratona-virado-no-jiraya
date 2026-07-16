package academy.marcoscaretaker.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000
        double valorParcela = 1000;
        double valorCarroCalcular = 34859;
        double valorCarroInicial = valorCarroCalcular;
        int totalParcelas = 0;
        while(true){
            if(valorCarroCalcular >= valorParcela){
                valorCarroCalcular -= valorParcela;
                totalParcelas++;
            }else{
                break;
            }
        }
        System.out.println("valor do carro: "+valorCarroInicial);
        System.out.println("valor parcela fixa : "+valorParcela);
        System.out.println("valor parcela variada: ");
        System.out.println("total de parcelas: "+totalParcelas);
        System.out.println("valor que não pôde ser parcelado: "+valorCarroCalcular);
    }
}
