public class BookMyStayApp {

    static int standardRooms = 10;
    static int deluxeRooms = 5;
    static int suiteRooms = 2;

    public static void main(String[] args) {

        confirmBooking("Standard");
        confirmBooking("Deluxe");
        confirmBooking("Suite");
        confirmBooking("Suite");

    }

    public static void confirmBooking(String roomType) {

        if (roomType.equalsIgnoreCase("Standard") && standardRooms > 0) {

            standardRooms--;
            System.out.println("Standard Room Booked");

        }
        else if (roomType.equalsIgnoreCase("Deluxe") && deluxeRooms > 0) {

            deluxeRooms--;
            System.out.println("Deluxe Room Booked");

        }
        else if (roomType.equalsIgnoreCase("Suite") && suiteRooms > 0) {

            suiteRooms--;
            System.out.println("Suite Room Booked");

        }
        else {

            System.out.println("Room Not Available");

        }

    }

}