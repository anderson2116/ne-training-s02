/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nesas-15
 */
public class JsonUserDAO implements UserDAO  {
    
    
    public void CrearU(String nom,String ced, String des) {
        System.out.println("JsonUserDAO.CrearU: " + nom + ", "+ced+"," + des);
        try {
            System.out.println("CREA PROYECTO"); 
           File fileToCreate = new File("/tmp/database/json");
           fileToCreate.mkdir();
            FileWriter myWriter = new FileWriter("/tmp/database/json/"+ced+".txt");
            myWriter.write(nom);
            myWriter.write(des);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
