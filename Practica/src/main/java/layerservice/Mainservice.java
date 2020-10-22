/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerservice;

import layerbusiness.UserManager;
import layerbusiness.VehicleManager;
import layerpresentacion.LoginUsuario;


/**
 *
 * @author nesas-15
 */
public class Mainservice {
    
    public static  void CrearU(String nom, String ced, String des){      
        System.out.println("Mainservices.CrearU: " +nom+ ", " +ced+ ", " +des);
        UserManager.getInstance().CrearU(nom, ced, des);
        
        
    }
    
     public static  void CrearV(String pla, String mar,  String desv){      
        System.out.println("Mainservices.CrearV: " +pla+ ", " +mar+ ", " +desv);
        VehicleManager.getInstance().CrearV(pla, mar, desv);
        
        
    }
    
    
}
