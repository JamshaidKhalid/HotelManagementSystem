package src;

public class Person {

    private String name;

    Person() {

    }
    Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
