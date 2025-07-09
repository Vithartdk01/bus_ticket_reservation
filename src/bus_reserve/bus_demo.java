package bus_reserve;
import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;
public class bus_demo {
          public static void main(String[] args) throws ParseException{

            ArrayList<bus> buses=new ArrayList<bus>();
            ArrayList<booking> bookings=new ArrayList<booking>();

            buses.add(new bus(1,true,2));
            buses.add(new bus(2,false,50));
            buses.add(new bus(3,true,42));
            
            int user=1;
            Scanner sc=new Scanner(System.in);
            for(bus b:buses){
                b.displayBusInfo();
            }

            while(user==1){
                 System.out.println("Enter 1 to 'Book' and 2 to 'Exit'");
            user=sc.nextInt();
            if(user==1){
                 booking booking_new=new booking();
                 if(booking_new.isAvailable(bookings,buses)){
                    bookings.add(booking_new);
                    System.out.println("Your booking is confirmed");
                 }
                 else{
                    System.out.println("Sorry the bus seats are filled.Please try another bus or other date!");
                 }
            }
            }
            
          }
}
