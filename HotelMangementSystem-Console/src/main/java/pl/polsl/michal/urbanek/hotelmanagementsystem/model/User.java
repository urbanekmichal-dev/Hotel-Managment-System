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
 * @author elson
 */
public class User {
    private String login;
    private String password;
    private String name;
    private String surname;
    private List<Booking> bookingList;
    
    public User(String name,String surname,String login,String password)
    {
        this.login=login;
        this.password=password;
        this.name=name;
        this.surname=surname;
        bookingList=new ArrayList<>();
        
    }
    
   public void AddNewBooking(String date)
   {
      Booking booking =new Booking(date);
      bookingList.add(booking);
   }
   
   

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }
    
      @Override
    public String toString() {
        return name+" "+ surname +" "+login+" ";
    }
    
    public void updateUser(String name,String surname,String login,String password) {
        
            this.name = name;
        
            this.surname = surname;
       
            this.login = login;
       
            this.password = password;
        
    }
}
    
     
    

