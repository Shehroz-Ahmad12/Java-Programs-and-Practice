/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Address implements Serializable {
    int house;
    int street;
    String city;

    public Address() {
    }

        
    public Address(int house, int street, String city) {
        this.house = house;
        this.street = street;
        this.city = city;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
}
