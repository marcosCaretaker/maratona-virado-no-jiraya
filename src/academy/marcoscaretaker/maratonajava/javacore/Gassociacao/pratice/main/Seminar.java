package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main;

import java.util.Objects;

public class Seminar {
    private String title;
    private Local local;
    private Student[] students;
    private Teacher[] teachers;

    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Local local, Student[] students) {
        this(title,local);
        this.setStudents(students);
    }

    public Seminar(String title, Local local, Teacher[] teachers) {
        this(title,local);
        this.setTeachers(teachers);

    }

    public Seminar(String title, Local local, Student[] students, Teacher[] teachers) {
        this(title,local);
        this.setStudents(students);
        this.setTeachers(teachers);
    }

    public void print() {
        System.out.println(" ");
        System.out.println("%%%%%%%%%%%%%%%%%%%% Seminar Information %%%%%%%%%%%%%%%%%%%%");
        System.out.println("Title: " + this.title);
        System.out.println("Local: " + this.local.getAddress());
        if (teachers != null) {
            System.out.println("**************** Teachers ****************");
            for (Teacher teacher : teachers) {
                System.out.println(teacher.getName() + "-" + teacher.getSpecialty());
            }
        }
        if (this.students == null) return;
        System.out.println("**************** Students ****************");
        for (Student student : this.students) {
            if (student != null) {
                System.out.println(student.getName() + "-" + student.getAge());
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(" ");
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        for (Teacher teacher : teachers) {
            teacher.setSeminars(this);
        }
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        if (students == null) return;

        int i = students.length;
        int j = 0;
        Student[] studentsArray = new Student[i];

        for (Student student : students) {
            if (student.getSeminar() != null) {
                System.out.println(" ");
                System.out.println("--- ERROR ---- " + this.title + " Estudante " + student.getName() + " já está no seminário " + student.getSeminar().getTitle() + ".");
                System.out.println(" ");
            } else {
                System.out.println(" ");
                System.out.println("----- ADICIONAMOS ----- " + student.getName() + " dentro do seminario: " + this.title);
                System.out.println(" ");
                student.setSeminar(this);
                studentsArray[j] = student;
                j++;
            }
        }

        this.students = studentsArray;
    }

    public String getLocal() {
        return local.getAddress();
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
