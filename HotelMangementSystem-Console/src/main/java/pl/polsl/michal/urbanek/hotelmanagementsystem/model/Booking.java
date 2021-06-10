/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michał Urbanek
 */
public class Booking {
    private String date;
    private List<Room> roomList;
    
    public Booking(String date)
    {
        this.date=date;
        roomList=new ArrayList<>();
    }

    Booking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void addRoomToLIst(int roomNumber,int numberOfPeople,int price,int floor)
    {
        Room room=new Room(roomNumber,numberOfPeople,price,floor);
        roomList.add(room);
    }
    
    public Room searchRoom(int roomNumber)
    {
        for(Room room: roomList)
        {
            if(room.getRoomNumber()==roomNumber) return room;
        }
         return null;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public String getDate() {
        return date;
    }
    
     @Override
    public String toString() {
        return date;
    }
    
}
