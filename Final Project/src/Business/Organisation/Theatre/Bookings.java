/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Theatre;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class Bookings {
    
    ArrayList<Booking> bookingList = new ArrayList<>();

    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(ArrayList<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public ArrayList<Booking> findBookingsforTheatre(int theatreId) {
        
        ArrayList<Booking> bookings = new ArrayList<>();
        for(Booking booking: bookingList)
        {
            if(booking.getTheatreId() == theatreId)
                bookings.add(booking);
        }
        System.out.println(bookings.size());
        return bookings;
    }
    
    
    
}
