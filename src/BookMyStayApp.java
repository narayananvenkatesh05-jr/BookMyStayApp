public class BookMyStayApp {

    public static void main(String[] args) {

        bookingRequest("Standard");
        bookingRequest("Deluxe");
        bookingRequest("Suite");

    }

    public static void bookingRequest(String roomType) {

        System.out.println("Booking request received for " + roomType + " room");

    }

}