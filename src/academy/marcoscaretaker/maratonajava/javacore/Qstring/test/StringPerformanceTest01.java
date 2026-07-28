package academy.marcoscaretaker.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30_000);
        long stop = System.currentTimeMillis();
        System.out.println("Time spent on String " + (stop - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        stop = System.currentTimeMillis();
        System.out.println("Time spent on StringBuilder " + (stop - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        stop = System.currentTimeMillis();
        System.out.println("Time spent on StringBuffer " + (stop - start) + "ms");
    }

    private static void concatString(int tamanho) {
        String text = "";
        for (int i = 0; i < tamanho; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
