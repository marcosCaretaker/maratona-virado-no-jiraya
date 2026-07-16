package academy.marcoscaretaker.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrInt = new int[3][];

        arrInt[0] = new int[2];
        arrInt[1] = array;
        arrInt[2] = new int[]{6, 7, 8, 9, 0, 2};

        int[][] arrDois = {{0,0}, {1,2,3},{1,2,3,4,5,6}};

        for (int[] arrBase : arrDois) {
            System.out.println("\n -------");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
