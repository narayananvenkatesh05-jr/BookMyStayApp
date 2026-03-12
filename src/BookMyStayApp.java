public class BookMyStayApp {

    static int availableRooms = 5;

    public static void cancelBooking(int roomsBooked)
    {
        availableRooms += roomsBooked;

        System.out.println("Booking Cancelled");
        System.out.println("Inventory Restored");
        System.out.println("Available Rooms: " + availableRooms);
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO BOOK MY STAY");

        int bookedRooms = 2;
        availableRooms -= bookedRooms;

        System.out.println("Rooms Booked: " + bookedRooms);
        System.out.println("Available Rooms: " + availableRooms);

        cancelBooking(bookedRooms);

    }
}