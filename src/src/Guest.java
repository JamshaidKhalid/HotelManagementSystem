package src;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Guest extends Person {


    private int id;
    private Room room;


    public Guest(){}

    public Guest(int id, String name, String contact, String gender) {
        setId(id);
        setName(name);
        setContact(contact);
        setGender(gender);
    }




//    Guest(int id) {
//        setId(id);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void guestDetails(int i, int rn, Room room){
        Guest guest = new Guest();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter customer name: ");
        guest.setName(sc.next());
        System.out.println("\nEnter customer contact: ");
        guest.setContact(sc.next());
        System.out.println("\nEnter customer gender: ");
        guest.setGender(sc.next());
        guest.setId(123);


        switch (i) {
            case 1:

                room.singleroom[rn]= new Room(guest.getId(), guest.getName(), guest.getContact(), guest.getGender(), rn, "1st", 250, 5000, RoomType.Single, RoomFeature.Balcony);

//                Booking booking = new Booking(guest, room.singleroom[rn], LocalDateTime.now(), LocalDateTime.now(), BookingStatus.Active, ActionType.Reserve);

                break;


            case 2:
                room.doubleroom[rn]= new Room(guest.getId(), guest.getName(), guest.getContact(), guest.getGender(), rn, "1st", 250, 5000, RoomType.Single, RoomFeature.Balcony);
                Booking booking2 = new Booking(guest, room.doubleroom[rn], LocalDateTime.now(), LocalDateTime.now(), BookingStatus.Active, ActionType.Reserve);
                break;

            default:System.out.println("Wrong option");
                break;
        }



    }

    public void Checkin(Room room) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your booking Id");
        int id = sc.nextInt();

//        System.out.println(guestDetails(0, ).guest.getId());
//        System.out.println(room.singleroom[1]);

        for (int j = 0; j < room.singleroom.length; j++) {
            if (id == room.singleroom[j].guest.getId()) {
                System.out.println(j + 1);
            }
        }
    }
}



