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
public class JsonDAOFactory extends  DAOFactory {
    
     public UserDAO userDAO = new JsonUserDAO();
     public VehicleDAO vehicleDAO = new JsonVehicleDAO();
    
    
   @Override
    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Override
    public VehicleDAO getVehicleDAO() {
        return vehicleDAO;
    }
    
}
