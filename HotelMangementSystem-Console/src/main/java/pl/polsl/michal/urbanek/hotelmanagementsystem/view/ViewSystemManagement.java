/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.view;

import java.util.List;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.SystemManagement;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.User;

/**
 *
 * @author elson
 */
public class ViewSystemManagement {
    public ViewSystemManagement(){}
    
    public void viewSystem(SystemManagement system)
    {
        
        
        System.out.println("Users list:");
        System.out.println("Name-Surname-Login");
        for(User elem:system.getUsersList())
            System.out.println(elem);

    }
    
  

    public void menuView() {
       System.out.println("Welcome in Hotel Management System!");
        System.out.println("Choose one of the options: ");
        System.out.println("1. Create user");
        System.out.println("2. Delete User");
        System.out.println("3. Update user");
        System.out.println("4. View  user list");
        System.out.println("5. Add new room");
        System.out.println("6. Delete room");
        System.out.println("7. Make a reservation)");
        System.out.println("8. Exit");
    }


   public void systemEnd()
   {
       System.out.println("The system has been shut down!");
   }
   
   public void viewUserEnterName()
    {
        System.out.println("Enter name: ");
    }
     public void viewUserEnterSurname()
    {
        System.out.println("Enter surname: ");
    }
     public void viewUserEnterLogin()
    {
        System.out.println("Enter login: ");
    }
     public void viewUserEnterPassword()
     {
        System.out.println("Enter password: ");
     }
   
   
}
