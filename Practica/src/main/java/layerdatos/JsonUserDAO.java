/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerdatos;

/**
 *
 * @author nesas-15
 */
public class JsonUserDAO implements UserDAO  {
    
    
    public void CrearU(String nom,String ced, String des) {
        System.out.println("JsonUserDAO.CrearU: " + nom + ", "+ced+"," + des);
    }
    
}