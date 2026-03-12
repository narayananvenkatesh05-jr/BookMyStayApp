import java.util.Scanner;

public class BookMyStayApp {

    public static void validateBooking() {

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter number of rooms: ");
            int rooms = sc.nextInt();

            if(rooms <= 0)
            {
                throw new IllegalArgumentException("Rooms must be greater than 0");
            }

            System.out.println("Booking Successful");

        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO BOOK MY STAY");
        validateBooking();

    }
}