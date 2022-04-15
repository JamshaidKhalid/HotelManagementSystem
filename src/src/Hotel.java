package src;

public class Hotel {
    static Room room = new Room();


    private String name;
    private Room[] rooms;
    private Employee[] employees;
    private Guest[] guests;
    private Booking[] bookings;
    private Invoice[] invoices;
    private Employee activeEmployee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Guest[] getGuests() {
        return guests;
    }

    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public Employee getActiveEmployee() {
        return activeEmployee;
    }

    public void setActiveEmployee(Employee activeEmployee) {
        this.activeEmployee = activeEmployee;
    }


    public Hotel(String name) {
        this.name = name;
    }

    public Employee login(String pin) {
        Employee employee = new Employee("abc");
        return employee;
    }

    public void addGuest(Guest guest) {
        Guest newString = guest;
    }

    public void addRoom(Room room) {
        Room newRoom = room;
    }

    public void addEmployee(Employee employee) {
        Employee newEmployee = employee;
    }


    static void availability(int ch2) {
        int j, count = 0;
        switch (ch2) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (room.singleroom[j] == null)
                        count++;
                }
                break;

            case 2:
                for (j = 0; j < 10; j++) {
                    if (room.doubleroom[j] == null)
                        count++;
                }
                break;
            default:
                System.out.println("Select valid option");
        }
        System.out.println("Number of rooms available : " + count);
    }
}
