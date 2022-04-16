package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            Hotel bookRoom = new Hotel("myHotel");
            int ch,ch2;
            char wish;
            String pin;

            System.out.println("Welcome to the Hotel...!\nDear staff member, Enter your pin to login\nPin: ");
            pin = sc.next();

            do{

                System.out.println("\nEnter your choice :\n1.Display room availability \n2.Book a room\n3.Checkout\n4.Exit\n");
                ch = sc.nextInt();
                switch(ch){
                    case 1:
                        System.out.println("\nSelect Room Type\n1: Single\n2: Double");
                        ch2 = sc.nextInt();
                        Hotel.availability(ch2);
                        break;

                    case 2:
                        System.out.println("\nChoose room type :\n1. Single Room \n2. Double Room\n");
                        ch2 = sc.nextInt();
                        bookRoom.bookroom(ch2);
//                      break;
//                    case 4:
//                        System.out.print("Room Number -");
//                        ch2 = sc.nextInt();
//                        if(ch2>60)
//                            System.out.println("Room doesn't exist");
//                        else if(ch2>40)
//                            Hotel.order(ch2-41,4);
//                        else if(ch2>30)
//                            Hotel.order(ch2-31,3);
//                        else if(ch2>10)
//                            Hotel.order(ch2-11,2);
//                        else if(ch2>0)
//                            Hotel.order(ch2-1,1);
//                        else
//                            System.out.println("Room doesn't exist");
//                        break;
//                    case 5:
//                        System.out.print("Room Number -");
//                        ch2 = sc.nextInt();
//                        if(ch2>60)
//                            System.out.println("Room doesn't exist");
//                        else if(ch2>40)
//                            Hotel.deallocate(ch2-41,4);
//                        else if(ch2>30)
//                            Hotel.deallocate(ch2-31,3);
//                        else if(ch2>10)
//                            Hotel.deallocate(ch2-11,2);
//                        else if(ch2>0)
//                            Hotel.deallocate(ch2-1,1);
//                        else
//                            System.out.println("Room doesn't exist");
//                        break;
//                    case 6:break x;

                }

                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0);
                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
                {
                    System.out.println("Invalid Option");
                    System.out.println("\nContinue : (y/n)");
                    wish=sc.next().charAt(0);
                }

            }while(wish=='y'||wish=='Y');


        }
        catch(Exception e)
        {
            System.out.println("Not a valid input");
        }
    }
}
