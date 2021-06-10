/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.michal.urbanek.hotelmanagementsystem.model;

/**
 *
 * @author elson
 */
public enum MenuType {
    ADD_USER,DELETE_USER,UPDATE_USER,VIEW_USER_LIST,ADD_ROOM,DELETE_ROOM,ADD_RESERVATION;
    
     public static MenuType getType(int i)
    {
            return values()[i];
    }
    
}
