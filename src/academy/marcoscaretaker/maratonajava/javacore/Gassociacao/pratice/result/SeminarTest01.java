package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Local;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Seminar;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Student;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Teacher;

public class SeminarTest01 {
    public static void main(String[] args) {
        Local local = new Local("Monte Fujikasane");

        Seminar seminar = new Seminar("Treinamento final",local);

        Seminar[] seminars = {seminar};

        Teacher teacher1 = new Teacher("Giyuu Tomioka","Respiração da àgua",seminars);

        Student student1 = new Student("Tanjiro Kamado",15);
        Student student2 = new Student("Nezuko Kamado",14);
        Student student3 = new Student("Zenitsu Agatsuma",15);

        Student[] students = {student1,student2,student3};

        seminar.setLocal(local);

        seminar.setStudents(students);

        local.setSeminar(seminar);


        teacher1.setSeminars(seminars);

        student1.setSeminar(seminar);

        student1.print();
        System.out.println("----------------");
        seminar.print();
        System.out.println("----------------");
        teacher1.print();
    }
}
