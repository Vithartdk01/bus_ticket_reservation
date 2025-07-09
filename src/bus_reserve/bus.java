package bus_reserve;

public class bus {
     private int busNo;
     private boolean ac;
     private int capacity; //get and set

     bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
     }

     public int getCapacity() { //accessor method
         return capacity;
     }
     public int getBusNo() {
         return busNo;
     }
     public boolean isAc(){
        return ac;
     }
     public void setCapacity(int capacity) { //mutator method
         this.capacity = capacity;
     }
     public void setAc(boolean val){
        ac=val;     
    }

    public void displayBusInfo(){
        System.out.println(" Bus No: "+ busNo +" Ac: "+ ac +" Total Capacity: "+ capacity);
    }

}
