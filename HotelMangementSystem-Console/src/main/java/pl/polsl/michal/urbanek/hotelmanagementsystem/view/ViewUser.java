/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.view;

import pl.polsl.michal.urbanek.hotelmanagementsystem.model.User;

/**
 *
 * @author elson
 */
public class ViewUser {
    
    public ViewUser(){}
    
    public void viewUser(User user){
        System.out.println("Name: "+user.getName());
        System.out.println("Surname: "+user.getSurname());
        System.out.println("Login: "+user.getLogin());
        System.out.println(user.getBookingList());
    }
    
    
            
}
