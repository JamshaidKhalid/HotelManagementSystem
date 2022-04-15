package src;

public class Guest extends Person {
    private int id;

    Guest(int id) {
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
