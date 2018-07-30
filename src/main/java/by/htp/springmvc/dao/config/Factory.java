package by.htp.springmvc.dao.config;

import by.htp.springmvc.Entity.UserDao;
import by.htp.springmvc.dao.domain.UserDaoImpl;

public class Factory {
	private static Factory instance = null;
	private static UserDao userDao = null;
	
    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
      
    public UserDao getUserDao() {
        if (userDao == null) {
        	userDao = new UserDaoImpl();
        }
        return userDao;
    }
}
