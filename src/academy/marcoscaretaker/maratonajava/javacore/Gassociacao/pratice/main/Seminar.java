package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main;

public class Seminar {
    private String title;
    private Local local;
    private Student[] students;

    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title,Local local, Student[] students) {
        this.title = title;
        this.students = students;
        this.local = local;
    }

    public void print(){
        System.out.println("Seminar Information");
        System.out.println("Title: "+this.title);
        System.out.println("Local: "+this.local.getAddress());
        if(students == null) return;
        System.out.println("Students: ");
        for(Student student:students){
            System.out.println(student.getName()+" "+student.getAge());
        }

    }



    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
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
