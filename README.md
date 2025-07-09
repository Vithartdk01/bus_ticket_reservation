## Bus Ticket Reservation System

The Bus Reservation System is a Java application that allows users to book bus tickets, check seat availability, and cancel reservations. The code is structured using object-oriented programming, with separate classes for buses and bookings, and uses Java collections to manage data in memory.
## How the Code Works?

- `Initialization:`: The program starts by initializing a list of available buses (with their numbers and capacities) and  no of bookings already done.
  - An empty list called buses where you can store and manage multiple bus objects.
  - An empty list is created to store bookings.
  
- `User Interaction (Menu):` The user is presented with options: book a ticket, cancel a ticket.
  
- `Booking a Ticket:`
   - The user enters their name, selects a bus number, and provides a travel date.
   - The system checks if seats are available for the selected bus and date using isAvailable.If available, the booking is added to the bookings list.
     
- `Viewing Bookings:`
    - The system displays all current bookings, showing passenger names, bus numbers, and travel dates.
      
- `Seat Availability:`
    - For each booking request, the system checks the number of existing bookings for that bus and date and compares it to the bus capacity.   

## Class
- `Bus:`
    - Role:Represents a bus entity.
    - Key Methods:getBusNo(), getCapacity(), bus details.
- `Booking:`
    - Role:Represents a ticket booking.
    - Key Methods:isAvailable()
- `Main:`
    - Role:Runs the application
    - Key Methods:Manages lists, calls Bus and Booking methods
  

