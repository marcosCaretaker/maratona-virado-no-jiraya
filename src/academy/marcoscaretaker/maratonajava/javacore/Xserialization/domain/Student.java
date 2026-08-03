package academy.marcoscaretaker.maratonajava.javacore.Xserialization.domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -9007334397553384616L;

    private Long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "DevDojo virado no Jiraya";
    private transient CourseClass courseClass;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(courseClass.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nameCourseClass = ois.readUTF();
            courseClass = new CourseClass(nameCourseClass);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", CourseClass='" + courseClass + '\'' +
                '}';
    }

    public CourseClass getCourseClass() {
        return courseClass;
    }

    public void setCourseClass(CourseClass courseClass) {
        this.courseClass = courseClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
