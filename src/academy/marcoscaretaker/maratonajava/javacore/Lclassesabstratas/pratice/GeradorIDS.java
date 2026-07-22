package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.pratice;

import java.util.Random;

public class GeradorIDS {
    Random random = new Random();

    public int gerarID() {
        int numGerado = 0;
        while (true) {
            numGerado = random.nextInt();
            if (numGerado > 0) {
                break;
            }
        }
        return numGerado;
    }

}
