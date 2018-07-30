package by.htp.springmvc.Entity;

import java.sql.SQLException;
import java.util.Collection;

public interface UserDao {
	 public void addUser(User user) throws SQLException, Exception;
	 public void updateUser(User user) throws SQLException, Exception;
	 public User getUserById(int id) throws SQLException, Exception;
	 public Collection<User> getAllUser() throws SQLException, Exception;
	 public void deleteUser(User user) throws SQLException, Exception;

}
