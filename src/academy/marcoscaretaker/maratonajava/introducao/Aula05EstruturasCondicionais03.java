package academy.marcoscaretaker.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // donate if your salary is more than 5,000
        double salary = 6000;
        String messageDonate = "I'm going to donate 500 to devDojo";
        String messageDoNotDonate = "I can't do it yet, but one day I will";
        // (condition) ? true : false
        String result = salary > 5000 ? messageDonate : messageDoNotDonate;
        System.out.println(result);
    }
}
