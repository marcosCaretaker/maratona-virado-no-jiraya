package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Local;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Seminar;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Student;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Teacher;

public class SeminarTest01 {
    public static void main(String[] args) {
        Local local = new Local("Monte Fujikasane");
        Local local2 = new Local("Casa das Borboletas");

        Seminar seminar1 = new Seminar("Treinamento final",local);
        Seminar seminar2 = new Seminar("Treinamento inicial",local2);

        Seminar[] seminars = {seminar1,seminar2};

        Teacher teacher1 = new Teacher("Giyuu Tomioka","Respiração da àgua");
        Teacher teacher2 = new Teacher("Shinobu Kocho","Inseto");
        Teacher teacher3 = new Teacher("Mitsuri Kanroji","Amor");
        Teacher[] teachers = {teacher1,teacher2,teacher3};

        Student student1 = new Student("Tanjiro Kamado",15);
        Student student2 = new Student("Nezuko Kamado",14);
        Student student3 = new Student("Zenitsu Agatsuma",15);
        Student[] students = {student1,student2,student3};

        Student studentA = new Student("Kenji Sato",15);
        Student studentB = new Student("Aiko Tanaka",16);
        Student studentC = new Student("Ryuu Kazemi",14);

        Student studentA1 = new Student("Naruto",22);

        Student[] studentsA = {studentA,studentB,studentC};

        Teacher teacherA = new Teacher("Daiki","Controle de energia espiritual");
        Teacher teacherB = new Teacher("Mestra Elara","Combate corpo a corpo");

        Teacher[] teachersA = {teacherA,teacherB};

        Local local3 = new Local("Instituto Celestial de Shinjuku");

        Seminar seminar3 = new Seminar("Seminário de Sobrevivência e Despertar de Habilidades Ocultas",local3,studentsA,teachersA);

        seminar1.setTeachers(teachers);
        seminar2.setTeachers(teachers);

        teacher1.setSeminars(seminars);
        teacher2.setSeminars(seminars);

        teacherA.setSeminars(seminar3);
        teacherB.setSeminars(seminar3);

        teacher3.setSeminars(seminars);
        seminar1.setStudents(students);
        seminar2.setStudents(students);

        seminar1.print();
        seminar2.print();
        seminar3.print();

        System.out.println("***************** TEACHERS *******************");

        teacher1.print();
        teacher2.print();
        teacher3.print();
        teacherA.print();
        teacherB.print();

        System.out.println("***************** STUDENTS *******************");

        student1.print();
        student2.print();
        student3.print();
        studentA.print();
        studentB.print();
        studentC.print();

        System.out.println(" ---- --- TESTE DE ADICIONAR ALUNO COM SEMINARIO EM SEMINARIO SEM ALUNO --- ----");

        seminar2.setStudents(new Student[]{student1});
        seminar2.print();
        student1.print();

        System.out.println(" ---- --- TESTE DE ADICIONAR ALUNO SEM SEMINARIO EM SEMINARIO COM ALUNO --- ----");
        System.out.println(" ---- --- QUE DEVE ACONTECER POIS ESTOU USANDO ARRAY BRUTO --- ----");
        seminar3.setStudents(new Student[]{studentA1});
        seminar3.print();
        studentA1.print();


    }
}
