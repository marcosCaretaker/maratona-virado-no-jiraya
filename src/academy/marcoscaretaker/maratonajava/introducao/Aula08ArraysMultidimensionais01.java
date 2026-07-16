package academy.marcoscaretaker.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][10];
        //primos
        dias[0][0] = 31;
        dias[0][1] = 27;
        dias[0][2] = 39;
        dias[0][3] = 37;
        dias[0][4] = 11;
        //pares
        dias[1][0] = 30;
        dias[1][1] = 28;
        dias[1][2] = 26;
        dias[1][3] = 24;
        dias[1][4] = 22;
        dias[1][5] = 21;
        dias[1][6] = 11;
        dias[1][7] = 13;
        dias[1][8] = 8;
        dias[1][9] = 4;
        // 5 em 5
        dias[2][0] = 5;
        dias[2][1] = 10;
        dias[2][2] = 15;
        dias[2][3] = 20;
        dias[2][4] = 25;

        for (int i = 0; i < dias.length; i++) {
            System.out.println("-- -- -- ----- -- -- --");

            for (int j = 0; j < dias[i].length; j++) {
                if (dias[i][j] == 0) {
                    continue;
                }
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("~~~~ ---------- ~~~~");
        // so pra brincar mostrando ao usuario se o numero é impar ou par kkkkkkk
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                if (dias[i][j] == 0) {
                    continue;
                }
                if (dias[i][j] % 2 == 0) {
                    System.out.println("Numero PAR: " + dias[i][j]);
                } else {
                    System.out.println("Numero IMPAR: " + dias[i][j]);
                }
            }
        }
        System.out.println("----++++====----");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                if (num == 0) {
                    continue;
                }
                System.out.println(num);
            }
        }
    }
}