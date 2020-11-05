/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.DAOFactory;
import data.UserDAO;
import data.VehicleDAO;



/**
 *
 * @author nesas-15
 */
public class VehicleManager {
    
    private static VehicleManager instance = null;

    public static VehicleManager getInstance() {
        if (VehicleManager.instance == null) {
            instance = new VehicleManager();
        }
        return VehicleManager.instance;
    }
    
    private VehicleManager(){
            }

    public void CrearV(String pla,String mar, String desv, Boolean xmlSelected, Boolean jsonSelected){
 
        if (xmlSelected) {
            System.out.println("xml");
            System.out.println("VehicleManager.CrearV: "+pla+", "+mar+","+desv);

         DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
        
        VehicleDAO vehicleDAO = daoFactory.getVehicleDAO();
        vehicleDAO.CrearV(pla,mar, desv);
        }
        if (jsonSelected) {
        System.out.println("JSON");
        System.out.println("VehicleManager.CrearV: "+pla+", "+mar+","+desv);

         DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.JSON);
        
        VehicleDAO vehicleDAO = daoFactory.getVehicleDAO();
        vehicleDAO.CrearV(pla,mar, desv);
  

        }
        
      
        
       
        
    }
    
}
