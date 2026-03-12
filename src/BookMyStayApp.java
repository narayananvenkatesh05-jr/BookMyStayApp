import java.io.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        try
        {
            FileWriter writer = new FileWriter("booking.txt");

            writer.write("BookingID:101 Room:201\n");
            writer.write("BookingID:102 Room:305\n");

            writer.close();

            System.out.println("Booking Data Saved");

            BufferedReader reader = new BufferedReader(new FileReader("booking.txt"));

            String line;

            System.out.println("Recovered Booking Data:");

            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}