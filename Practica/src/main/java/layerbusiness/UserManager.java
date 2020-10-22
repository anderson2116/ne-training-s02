/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerbusiness;

import layerdatos.DAOFactory;
import layerdatos.UserDAO;
import layertools.Encryptor;



/**
 *
 * @author nesas-15
 */
public class UserManager {
    
    private static UserManager instance = null;

    public static UserManager getInstance() {
        if (UserManager.instance == null) {
            instance = new UserManager();
        }
        return UserManager.instance;
    }
    
    private UserManager(){
            }

    
    
    public void CrearU(String nom,String ced, String des){
    
   Encryptor aesWithCbc = new Encryptor()
                .type(Encryptor.TYPES.AES)
                .cbc(true)
                .publicKey("my publi key")
                .secret("password");
        Encryptor tripleDESnoCBC = new Encryptor()
                .type(Encryptor.TYPES.TRIPLEDES)
                .cbc(false)
                .secret("password");
        
        
        String encrypt = aesWithCbc.encrypt(ced);
        String encrypt2 = tripleDESnoCBC.encrypt(ced);
        
        
        System.out.println("UserManager.CrearU: "+nom+", "+ced+","+des);
        
        DAOFactory daoFactory = DAOFactory.getDAOFactory(Math.random() > 0.5 ? DAOFactory.XML : DAOFactory.JSON);
        
        UserDAO userDAO = daoFactory.getUserDAO();
        userDAO.CrearU(nom,ced,des);
         
    } 
    
    
}
