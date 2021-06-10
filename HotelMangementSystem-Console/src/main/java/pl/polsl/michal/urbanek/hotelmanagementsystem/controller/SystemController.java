/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.controller;

import java.util.Scanner;
import java.util.stream.Stream;
import jdk.dynalink.StandardNamespace;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.SystemManagement;
import pl.polsl.michal.urbanek.hotelmanagementsystem.model.User;
import pl.polsl.michal.urbanek.hotelmanagementsystem.view.ViewSystemManagement;
import pl.polsl.michal.urbanek.hotelmanagementsystem.view.ViewUser;

/**
 *
 * @author elson
 */
public class SystemController {
    private ViewSystemManagement viewSystem;
    private SystemManagement systemManagement;

    public SystemController() 
    {
        this.systemManagement=new SystemManagement();
        this.viewSystem=new ViewSystemManagement();
    }
    
    public void addUser()
    {
        String name,surname,login,password;
        Scanner scanner = new Scanner(System.in);
        this.viewSystem.viewUserEnterName();
        name = scanner.next();
        this.viewSystem.viewUserEnterSurname();
        surname=scanner.next();
        this.viewSystem.viewUserEnterLogin();
        login=scanner.next();
        this.viewSystem.viewUserEnterPassword();
        password=scanner.next();
        systemManagement.addNewUser(name, surname, login, password); 
    }

    public SystemManagement getSystemManagement() {
        return systemManagement;
    }

    public ViewSystemManagement getViewSystem() {
        return viewSystem;
    }
    
    public void deleteUser()
    {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        name = scanner.next();
        if(systemManagement.deleteUser(name))
        {
            System.out.println("Successfully deleted!");
        }
        else System.out.println("The operation failed");
        
    }
    
    public void updateUser()
    {
        String name,surname,login, password;
        String bufor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        bufor = scanner.next();
        for(User elem :systemManagement.getUsersList())
            if(elem.getName().equals(bufor)) 
            {
                System.out.println("Update name");
                name=scanner.next();
                System.out.println("Update surname");
                surname=scanner.next();
                System.out.println("Update login");
                login=scanner.next();
                System.out.println("Update password");
                password=scanner.next();
                elem.updateUser(name,surname,login,password);
            }

    }
    public void viewUserList()
    {
        Stream<User> stream;
        System.out.println("---------------------");
        System.out.println("NAME-SURNAME-LOGIN");
        
        stream=systemManagement.getUsersList().stream();
        stream.forEach(p->System.out.println(p));
        
        System.out.println("---------------------");
    }
    public void addRoom(){
        
    }
    public void deleteRoom()
    {
        
    }
    
    public void addResrevation()
    {
        
    }
    
    
}
