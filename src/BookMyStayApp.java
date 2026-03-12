import java.util.Scanner;

public class BookMyStayApp {

    public static void addOnServices() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Add-On Services:");
        System.out.println("1. Breakfast");
        System.out.println("2. Airport Pickup");
        System.out.println("3. Spa Access");

        System.out.print("Select Service: ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Breakfast Added.");
                break;

            case 2:
                System.out.println("Airport Pickup Added.");
                break;

            case 3:
                System.out.println("Spa Access Added.");
                break;

            default:
                System.out.println("Invalid Service");
        }

        sc.close();
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO BOOK MY STAY");
        addOnServices();

    }
}