package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("Teacher Information");
        System.out.println("Name: "+this.name);
        System.out.println("Speciality: "+this.specialty);
        if(seminars == null) return;
        for(Seminar seminar:seminars){
            System.out.println(seminar.getTitle()+" "+seminar.getLocal());
        }
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
