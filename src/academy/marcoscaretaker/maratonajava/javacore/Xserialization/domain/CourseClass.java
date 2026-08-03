package academy.marcoscaretaker.maratonajava.javacore.Xserialization.domain;

public class CourseClass {
    private String name;

    public CourseClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
