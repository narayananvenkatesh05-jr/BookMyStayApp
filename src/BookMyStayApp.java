class BookingThread extends Thread {

    static int rooms = 3;

    public void run()
    {
        synchronized(BookingThread.class)
        {
            if(rooms > 0)
            {
                System.out.println(Thread.currentThread().getName() + " booked a room");
                rooms--;
            }
            else
            {
                System.out.println(Thread.currentThread().getName() + " No rooms available");
            }
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO BOOK MY STAY");

        BookingThread t1 = new BookingThread();
        BookingThread t2 = new BookingThread();
        BookingThread t3 = new BookingThread();
        BookingThread t4 = new BookingThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}