package academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.test;

import academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Dr. Stranger";
        professor.age = 43;
        professor.sex = 'M';

        System.out.println("Nome do professor: "+professor.name+" idade:"+professor.age+" sexo: "+professor.sex);


    }
}
