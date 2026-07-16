package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.test;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.School;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Anko Mitarashi");
        Teacher teacher2 = new Teacher("Suzumeno");
        Teacher teacher3 = new Teacher("Kurenai Yuhi");
        Teacher[] teachers = {teacher1,teacher2,teacher3 };
        School school1 = new School("Konoha",teachers);
        school1.print();
        teacher2.setName("Tsunade");
        school1.print();
    }
}
