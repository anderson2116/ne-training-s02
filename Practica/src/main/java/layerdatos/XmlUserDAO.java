/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerdatos;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nesas-15
 */
public class XmlUserDAO implements UserDAO  {
    
    @Override
    public void CrearU(String nom, String ced, String des) {
        System.out.println("XmlUserDAO.CrearU: "+nom+","+ced+" ,"+des);
        try {
            FileWriter myWriter = new FileWriter("/tmp/lab/"+ced+".txt");
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
