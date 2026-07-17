package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminar) {
        this.name = name;
        this.age = age;
        this.seminar = seminar;
    }

    public void print(){
        System.out.println(" ");
        System.out.println("########## Student Information ##########");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        if(seminar == null) return;
        System.out.println("Seminar: "+this.seminar.getTitle());
        System.out.println("Seminar local: "+this.seminar.getLocal());
        System.out.println("########## ########## ##########");
        System.out.println(" ");
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
