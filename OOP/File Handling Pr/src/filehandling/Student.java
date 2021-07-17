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
public class Student implements Serializable {
    
    String name;
    String regID;
    Address add;
    double GPA;

    public Student() {
    }

    public Student(String name, String regID, Address add, double GPA) {
        this.name = name;
        this.regID = regID;
        this.add = add;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    
    
    
}
