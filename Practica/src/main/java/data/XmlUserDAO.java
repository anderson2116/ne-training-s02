/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author nesas-15
 */
public class XmlUserDAO implements UserDAO  {
    
    @Override
    public void CrearU(String nom, String ced, String des) {
        System.out.println("XmlUserDAO.CrearU: "+nom+","+ced+" ,"+des);
        try {
            
           File fileToCreate = new File("/tmp/database/xml");
           fileToCreate.mkdir();
            FileWriter myWriter = new FileWriter("/tmp/database/xml/"+ced+".txt");
            myWriter.write(nom + "/n" );
            myWriter.write(des);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
