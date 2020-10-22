
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
public abstract class DAOFactory {
    
    public static final int XML = 1;
    public static final int JSON = 2;
    
    
    public abstract UserDAO getUserDAO();
    public abstract VehicleDAO getVehicleDAO();
    
     public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case XML:
                return new XmlDAOFactory();
            case JSON:
                return new JsonDAOFactory();
            default:
                return null;
        }
    }
    
}
