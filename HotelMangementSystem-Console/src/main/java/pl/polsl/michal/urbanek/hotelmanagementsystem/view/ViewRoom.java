/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.view;

import pl.polsl.michal.urbanek.hotelmanagementsystem.model.Room;

/**
 *
 * @author elson
 */
public class ViewRoom {
    public ViewRoom()
    {}
    
    public void viewRoom(Room room)
    {
        System.out.println("Room numer: "+room.getRoomNumber());
        System.out.println("Floor: "+room.getFloor());
        System.out.println("Number of people: "+room.getNumberOfPeople());
        System.out.println("Price "+room.getPrice());
        System.out.println();
    }
}
