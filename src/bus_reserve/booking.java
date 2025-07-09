package bus_reserve;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
          String passenger_name;
          int busNo;
          Date date;

          booking() throws ParseException{
            Scanner sc=new Scanner((System.in));
            System.out.println("Enter passenger name");
            passenger_name=sc.next();

           System.out.println("Enter Bus No:");
           busNo=sc.nextInt(); 

           System.out.println("Enter the date in dd-mm-yyyy:");
           String dateInput=sc.next();
           SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
           date=dateFormat.parse(dateInput);

           try{
            date=dateFormat.parse(dateInput);
           }catch(ParseException e){
            e.printStackTrace();
           }
          }
          public boolean isAvailable(ArrayList<booking>bookings,ArrayList<bus>buses){
            int capacity=0;
            for(bus b:buses){
                if(b.getBusNo()==busNo){
                    capacity=b.getCapacity();
                }
                int booked=0;
                for(booking book:bookings){
                    if(book.busNo==busNo && book.date.equals(date)){
                           booked++;
                    }
                }
                return booked<capacity?true:false;
            }
            return false;
          }
}
