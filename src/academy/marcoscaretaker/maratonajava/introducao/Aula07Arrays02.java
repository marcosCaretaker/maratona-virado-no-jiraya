package academy.marcoscaretaker.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, long, int, float, double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[5];
        nomes[0] = "Tanjiro";
        nomes[1] = "Nezuko";
        nomes[2] = "Zenitsu";
        nomes[3] = "Hinata";
        nomes[4] = "Goku";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
