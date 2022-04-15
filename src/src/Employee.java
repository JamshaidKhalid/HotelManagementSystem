package src;

public class Employee extends Person {
    private String pin;

    Employee(String pin) {
        setPin(pin);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
