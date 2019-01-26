import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Tom")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"));) {
//            пример первого урока
//            oos.writeObject(person1);
//            oos.writeObject(person2);
//            oos.close();

//            пример второго урока - 1
//            oos.writeInt(people.length);
//            for (Person person : people) {
//                oos.writeObject(person);
//            }

//            пример второго урока - 2
//            oos.writeObject(people);

//            пример третьего урока
            oos.writeObject(person1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
