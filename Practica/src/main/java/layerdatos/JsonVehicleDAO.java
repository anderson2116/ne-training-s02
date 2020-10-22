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
public class JsonVehicleDAO implements VehicleDAO {
    
   
    public void CrearV(String pla,String mar, String desv) {
        System.out.println("JsonVehicleDAO.CrearV: " + pla + ", " +mar+ ","+ desv);
    }
    
    
}
