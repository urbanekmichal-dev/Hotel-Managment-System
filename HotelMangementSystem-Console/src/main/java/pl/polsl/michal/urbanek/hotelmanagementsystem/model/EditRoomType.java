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
public enum EditRoomType {
        NUMBER, PRICE, NUMER_OF_PEOPLE,FLOOR;
  
    public static EditRoomType getType(int i)
    {
            return values()[i];
    }
}
