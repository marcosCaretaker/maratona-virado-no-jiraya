package academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.test;

import academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.name = "Zenitsu";
        estudante2.age = 19;
        System.out.println(estudante.sex);
        System.out.println(estudante.age);
        System.out.println(estudante.name);
        System.out.println("------------");
        System.out.println(estudante2.sex);
        System.out.println(estudante2.age);
        System.out.println(estudante2.name);
    }
}
