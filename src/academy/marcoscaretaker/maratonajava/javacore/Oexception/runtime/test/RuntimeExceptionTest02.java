package academy.marcoscaretaker.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {

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

    public static void main(String[] args) {
        System.out.println(div(1, 0));
    }
    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    public static int div(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
