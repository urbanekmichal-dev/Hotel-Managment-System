/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author elson
 */
public class SystemManagement {
    private List<User> usersList;
    
    public SystemManagement()
    {
        usersList=new ArrayList<>();
    }
    
    public void addNewUser(String name,String surname,String login,String password)
    {
        User newUser=new User(name, surname, login, password);
        usersList.add(newUser);
    }

    
    public void addUser()
    {
        System.out.println("ADD USER");
    }
    
    public boolean deleteUser(String name)
    {
      System.out.println("DELETE USER"); 
   
      for(User elem:usersList)
      {
          if(elem.getName().equals(name))
          {
              usersList.remove(elem);
              return true;
          }
      }
      return false;
    }
    
    
    
    public void viewUserList()
    {
        System.out.println("VIEW LIST");
    }
    
    public void addRoom()
    {
        System.out.println("ADD ROOM");
    }
    
    public void deleteRoom()
    {
        System.out.println("DLETEE ROOM");
    }
     public void addResrevation()
    {
        String name,date;
        System.out.println("List of available rooms: ");
        Scanner scanner = new Scanner(System.in);
        name=scanner.next();
        for(User elem:usersList)
      {
          if(elem.getName().equals(name))
          {
           System.out.println("List of available rooms: ");
           
            date=scanner.next();
            
             
          }
         
    }
    }
    

    public List<User> getUsersList() {
        return usersList;
    }
    
    
    
}
