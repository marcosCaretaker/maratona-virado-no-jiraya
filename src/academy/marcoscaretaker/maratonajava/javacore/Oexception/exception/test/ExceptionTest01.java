package academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

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


    // Repare: NÃO tem "throws" aqui!
    // Por quê? Porque RuntimeException não obriga ninguém a avisar nada
    public static void main(String[] args) {
        createNewArchive();
    }

    // Também sem "throws" — mesma lógica
    private static void createNewArchive() {
        File file = new File("archive\\test.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Archive created: " + isCreated);

        } catch (IOException e) {
            // Mesma coisa: primeiro registra o erro pra debug
            e.printStackTrace();

            // AQUI é a diferença chave!
            // Em vez de jogar a MESMA exceção "e" (IOException) pra frente,
            // eu crio uma exceção NOVA, do tipo RuntimeException,
            // com a minha própria mensagem explicando o problema
            throw new RuntimeException("Problem when trying to create the file");

            // Detalhe: perceba que a exceção original "e" não é passada
            // como "causa" aqui — então quem for debugar só vai ver
            // essa mensagem nova, não o motivo real do IOException
        }
    }
}