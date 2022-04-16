package src;
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
                break;


            case 2:
                room.doubleroom[rn]= new Room(guest.getId(), guest.getName(), guest.getContact(), guest.getGender(), rn, "1st", 250, 5000, RoomType.Single, RoomFeature.Balcony);
                break;

            default:System.out.println("Wrong option");
                break;
        }


    }

//    public Guest(int i, int rn)
//    {
//
//        System.out.print("\nEnter customer name: ");
//        name = sc.next();
//        System.out.print("Enter contact number: ");
//        contact=sc.next();
//        System.out.print("Enter gender: ");
//        gender = sc.next();
//        if(i<3)
//        {
//            System.out.print("Enter second customer name: ");
//            name2 = sc.next();
//            System.out.print("Enter contact number: ");
//            contact2=sc.next();
//            System.out.print("Enter gender: ");
//            gender2 = sc.next();
//        }
//
//
//    }
}
