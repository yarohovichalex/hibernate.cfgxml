package by.htp.springmvc.web.action;

import java.sql.SQLException;
import java.util.Collection;

import org.hibernate.Session;

import by.htp.springmvc.Entity.User;
import by.htp.springmvc.dao.config.Factory;

public class Temp {

	public static void main(String[] args) {
        Session session = null;
        try {
           Collection<User> users = Factory.getInstance().getUserDao().getAllUser();
//        	Factory.getInstance().getUserDao().addUser(new User());
            System.out.println(users.size());         
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

	}

}
