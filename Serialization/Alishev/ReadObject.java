import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
//            пример первого урока
//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();
//            ois.close();
//            System.out.println(person1);
//            System.out.println(person2);

//            пример второго урока - 1
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));

//            пример второго урока - 2
//            Person[] people = (Person[]) ois.readObject();
//            System.out.println(Arrays.toString(people));

//            пример третьего урока
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}