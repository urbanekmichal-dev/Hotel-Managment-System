/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.view;

import java.util.Arrays;
import java.util.List;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.Booking;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.Room;

/**
 *
 * @author elson
 */
public class ViewBooking {
    
    public ViewBooking(){}
    
    public void viewBooking(Booking booking)
    {
        System.out.println("Your list of reservation: ");
        System.out.println(booking.getDate());
        System.out.println(booking.getRoomList());
                
    }
    
        
    
}
