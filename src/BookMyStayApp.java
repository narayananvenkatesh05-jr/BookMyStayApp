public class BookMyStayApp {

    static int standardRooms = 10;
    static int deluxeRooms = 5;
    static int suiteRooms = 2;

    public static void main(String[] args) {

        checkAvailability("Standard");
        checkAvailability("Deluxe");
        checkAvailability("Suite");
        checkAvailability("Premium");

    }

    public static void checkAvailability(String roomType) {

        if (roomType.equalsIgnoreCase("Standard")) {

            System.out.println("Standard Rooms Available: " + standardRooms);

        }
        else if (roomType.equalsIgnoreCase("Deluxe")) {

            System.out.println("Deluxe Rooms Available: " + deluxeRooms);

        }
        else if (roomType.equalsIgnoreCase("Suite")) {

            System.out.println("Suite Rooms Available: " + suiteRooms);

        }
        else {

            System.out.println("Invalid Room Type");

        }

    }
}