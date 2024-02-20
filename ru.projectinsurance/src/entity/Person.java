package entity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;

    public Person(int id, String lastName, String firstName, String middleName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) throws IOException {

        Person person1 = new Person(1, "Захаров", "Максим", "Сергеевич", 27);
        Person person2 = new Person(2, "Мишин", "Егор", "Алексеевич", 26);
        Person person3 = new Person(3, "Олисов", "Антон", "Павлович", 27);

        String data = person1.getId() + "," + person1.getLastName() + "," + person1.getFirstName() + "," + person1.getMiddleName() + "," + person1.getAge() + "\n" +
                person2.getId() + "," + person2.getLastName() + "," + person2.getFirstName() + "," + person2.getMiddleName() + "," + person2.getAge() + "\n" +
                person3.getId() + "," + person3.getLastName() + "," + person3.getFirstName() + "," + person3.getMiddleName() + "," + person3.getAge();

        File file = Path.of("Person","person.txt").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(data.getBytes());


    }
}