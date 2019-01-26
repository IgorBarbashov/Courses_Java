package Clone;

public class ShallowCopy {
    public static void main(String[] args) {
        Person husband0 = new Person();
        husband0.name = "Mike";
        Person wife = new Person();
        wife.name = "Sara";
        husband0.couple = wife;
        wife.couple = husband0;

        Person husband1 = new Person(husband0); // пример shallow copy

    }
}

class Person {
    public String name;
    public Person couple;

    public Person() {
    }

    public Person(Person source) {
        this.name = source.name;
        this.couple = source.couple;
    }
}