public class BookMyStayApp {

    static int standardRooms = 10;
    static int deluxeRooms = 5;
    static int suiteRooms = 2;

    public static void main(String[] args) {

        System.out.println("WELCOME TO BOOK MY STAY");

        showInventory();

    }

    public static void showInventory() {

        System.out.println("Room Inventory:");

        System.out.println("Standard Rooms: " + standardRooms);
        System.out.println("Deluxe Rooms: " + deluxeRooms);
        System.out.println("Suite Rooms: " + suiteRooms);

    }

}