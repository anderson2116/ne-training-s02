/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerbusiness;

import layerdatos.DAOFactory;
import layerdatos.VehicleDAO;
import layertools.Encryptor;


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

    public void CrearV(String pla,String mar, String desv){
    
   Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");
        
        
        String encrypt = aesWithCbc.encrypt(pla);
        String encrypt2 = tripleDESnoCBC.encrypt(pla);
        
        
        System.out.println("UserManager.CrearU: "+pla+", "+mar+","+desv);
        
        DAOFactory daoFactory = DAOFactory.getDAOFactory(Math.random() > 0.5 ? DAOFactory.XML : DAOFactory.JSON);
        
        VehicleDAO vehicleDAO = daoFactory.getVehicleDAO();
        vehicleDAO.CrearV(pla,mar, desv);
  
        
    }
    
}
