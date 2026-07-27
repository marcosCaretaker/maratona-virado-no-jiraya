package academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    //Throwable
   //├── Error (coisa grave de JVM, tipo OutOfMemoryError — nem mexe)
   //└── Exception
        //├── RuntimeException  ← e tudo que é filho dela = UNCHECKED
        //│     ├── NullPointerException
        //│     ├── IllegalArgumentException
        //│     └── (sua RuntimeException customizada)
              //│
              //└── tudo mais (que NÃO é filha de RuntimeException) = CHECKED
              //├── IOException
              //├── SQLException
              //└── ...



    // "throws IOException" aqui é o main dizendo:
    // "eu não vou tratar nenhum problema de IO, se acontecer, jogo para o Java resolver (e ele vai crashar o programa)"
    public static void main(String[] args) throws IOException {
        createNewArchive();
    }

    // Esse método também fala "throws IOException" =
    // "eu SEI que posso dar erro aqui dentro, mas não vou resolver, vou empurrar pra frente"
    private static void createNewArchive() throws IOException {
        File file = new File("archive\\test.txt");

        try {
            // Aqui é onde o perigo mora: criar arquivo pode falhar
            // (pasta não existe, sem permissão, etc)
            boolean isCreated = file.createNewFile();
            System.out.println("Archive created: " + isCreated);

        } catch (IOException e) {
            // "Ih, deu erro! Calma, deixa eu pelo menos AVISAR o que aconteceu..."
            e.printStackTrace(); // imprime o "raio-x" do erro no console, pra debug

            // "...mas eu não vou resolver esse problema aqui.
            // Vou pegar a MESMA exceção que recebi (a original, a "e")
            // e relançar ela pra quem chamou esse método resolver"
            throw e;
        }
    }
}