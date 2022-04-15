package src;

public class Room {
    private String number;
    private String floor;
    private String section;
    private double area;
    private double rate;
    private RoomType type;
    private RoomFeature[] features;

    //constructor
    public Room(){}

    public Room(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public RoomFeature[] getFeatures() {
        return features;
    }

    public void setFeatures(RoomFeature[] features) {
        this.features = features;
    }


    Room room[]=new Room[10]; //new Rooms
}
