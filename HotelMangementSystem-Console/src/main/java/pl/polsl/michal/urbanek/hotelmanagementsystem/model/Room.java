/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.model;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author elson
 */
public class Room implements Iterable<String>, Iterator<String>{
    private int roomNumber;
    private int numberOfPeople;
    private int price;
    private int floor;  
    private int index;
    
    public Room(int roomNumber, int numberOfPeople, int price, int floor) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.numberOfPeople = numberOfPeople;
        this.price = price;
    }
     
    

    @Override
    public Iterator<String> iterator() {
        index = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < 4;
    }

    @Override
    public String next() {
        switch (index++) {
            case 0:
                return String.valueOf(roomNumber);
            case 1:
                return String.valueOf(numberOfPeople);
            case 2:
                return "" + price;
            case 3:
                return "" + floor;
            default:
                return null;
        }
    }

    @Override
    public void remove() {
    }

    public String toString() {
        return roomNumber + ", " + numberOfPeople + ", " + price + ", " + floor;
    }



    
  
    
    
    
    public boolean editRoomNumber(String newRoomNumber)
    {  
        try{
           this.roomNumber=Integer.parseInt(newRoomNumber); 
           return true;
        }
        catch (NumberFormatException e)
        {
            //System.out.println("Bad room number value");
            return false;
            
        }    
    }
    
     public boolean editRoomFloor(String newFloor)
    {
        try{
           this.floor=Integer.parseInt(newFloor); 
           return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        } 
    }
     
      public boolean editRoomPrice(String newPrice)
    {
       try{
           this.price=Integer.parseInt(newPrice); 
           return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
      
        public boolean editRoomNumberOfPeople(String newNumberOfPeople)
    {
         try{
           this.numberOfPeople=Integer.parseInt(newNumberOfPeople); 
           return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    public void editRoom(EditRoomType editType,String editValue){
       
        switch(editType)
        {
            case NUMBER: editRoomNumber(editValue); break;
            case PRICE: editRoomPrice(editValue); break;
            case NUMER_OF_PEOPLE: editRoomNumberOfPeople(editValue); break;
            case FLOOR: editRoomFloor(editValue); break;
            
            
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getPrice() {
        return price;
    }

    public int getFloor() {
        return floor;
    }
    
    

        
  
    

    
}


