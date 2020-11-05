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
public class XmlVehicleDAO implements VehicleDAO{
 
     @Override
    public void CrearV(String pla, String mar, String desv) {
        System.out.println("XmlUserDAO.CrearU: "+pla+","+mar+" ,"+desv);
        try {
            
            File fileToCreate = new File("/tmp/database/xml");
            fileToCreate.mkdir();
            FileWriter myWriter = new FileWriter("/tmp/database/xml/"+pla+".txt");
            myWriter.write(mar);
            myWriter.write(desv);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }   
}
