/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.DAOFactory;
import data.UserDAO;

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

    private UserManager() {

    }

    public void CrearU(String nom, String ced, String des, Boolean xmlSelected, Boolean jsonSelected) {
        System.out.println("sdfgsdfg ==> "+ xmlSelected);
        System.out.println("333 ==> "+ jsonSelected);
        if (xmlSelected) {
            System.out.println("xml");
            System.out.println("UserManager.CrearU: " + nom + ", " + ced + "," + des);

            DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.XML);
            UserDAO userDAO = daoFactory.getUserDAO();
            userDAO.CrearU(nom, ced, des);

        }
        if (jsonSelected) {
        System.out.println("JSON");
            System.out.println("UserManager.CrearU: " + nom + ", " + ced + "," + des);

            DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.JSON);
            UserDAO userDAO = daoFactory.getUserDAO();
            userDAO.CrearU(nom, ced, des);

        }
    }

}
