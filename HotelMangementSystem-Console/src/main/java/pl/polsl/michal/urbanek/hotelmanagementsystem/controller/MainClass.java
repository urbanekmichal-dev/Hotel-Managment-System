/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.controller;

import java.util.Scanner;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.EditRoomType;
import static pl.polsl.michal.urbanek.hotelmanagementsystem.model.EditRoomType.PRICE;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.Room;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.SystemManagement;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.User;
import pl.polsl.michal.urbanek.hotelmanagementsystem.view.ViewRoom;
import pl.polsl.michal.urbanek.hotelmanagementsystem.view.ViewSystemManagement;
import pl.polsl.michal.urbanek.hotelmanagementsystem.view.ViewUser;

/**
 *
 * @author elson
 */
public class MainClass {
    public static void main(String args[]) {
//
        //////////////////////////////////////////////////////
        SystemController system=new SystemController();
        system.getSystemManagement().addNewUser("Miroslaw", "Lok", "Mir123", "l89273");
        system.getSystemManagement().addNewUser("Anna", "Zak", "Ann123", "l8229273");
        system.getSystemManagement().addNewUser("Michal", "Urbanek", "mich123", "pass");
        
        
        Scanner scanner = new Scanner(System.in);
        String bufor;
        int numberOption;
        while(true)
        {
        do {            
            system.getViewSystem().menuView();
            bufor = scanner.next();
            numberOption=Integer.parseInt(bufor);
        } while (numberOption<1 || numberOption>8);
        if(numberOption==8) break;

        switch(numberOption)
        {
            case 1: system.addUser(); break;
            case 2: system.deleteUser(); break;
            case 3: system.updateUser(); break;
            case 4: system.viewUserList();break;
            case 5: system.addRoom(); break;
            case 6: system.deleteRoom(); break;
            case 7: system.addResrevation(); break;
        }
    
        } 
        system.getViewSystem().systemEnd();
    }   
}
