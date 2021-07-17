/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Address a1 = new Address(10, 8, "Islamabad");
        Address a2 = new Address(8,52,"Lahore");
        
        Student s1 = new Student ("Ali" , "SP16-BCS-075", a1 , 4.0);
        
        Student s2 = new Student ("Saba ", " Fall18-BCS-052", a2, 3.7);
        
       FileOperations.writeToFile(s1);
       FileOperations.writeToFile(s2);
       
     ArrayList<Student> list =   FileOperations.readAllData();
     
     for (int i=0 ;i< list.size();i++)
     {
         System.out.println(list.get(i).getName());
     }
        
        
        System.out.println(FileOperations.search("Ali"));
        
        
       
    }
    
}
