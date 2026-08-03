package academy.marcoscaretaker.maratonajava.javacore.Xserialization.test;

import academy.marcoscaretaker.maratonajava.javacore.Xserialization.domain.CourseClass;
import academy.marcoscaretaker.maratonajava.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L,"Caretaker","9816234");
        CourseClass courseClass = new CourseClass("Java Marathon: Better Family Conditions Coming Soon");
        student.setCourseClass(courseClass);
        serialize(student);
        deserialize();
    }
    private static void serialize(Student student){
        Path path = Paths.get("folder/student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(student);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserialize(){
        Path path = Paths.get("folder/student.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
