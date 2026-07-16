package academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.test;

import academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Theo";
        estudante.age = 2;
        estudante.sex = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.name = "Ângela";
        estudante2.age = 22;
        estudante2.sex = 'F';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.sex);

        System.out.println(estudante);

        System.out.println(estudante2);
    }
}
