import java.util.ArrayList;

public class BookMyStayApp {

    public static void bookingHistory() {

        ArrayList<String> history = new ArrayList<>();

        history.add("Booking ID:101 Room:201");
        history.add("Booking ID:102 Room:305");
        history.add("Booking ID:103 Room:402");

        System.out.println("Booking History Report");

        for(String record : history)
        {
            System.out.println(record);
        }
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO BOOK MY STAY");
        bookingHistory();

    }
}