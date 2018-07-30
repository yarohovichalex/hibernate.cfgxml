package by.htp.springmvc.dao.domain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import by.htp.springmvc.Entity.User;
import by.htp.springmvc.Entity.UserDao;
import by.htp.springmvc.dao.config.HibernateUtil;

public class UserDaoImpl implements UserDao{
	 
	private Session session ;
	
	

	public UserDaoImpl() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	@Override
	public void addUser(User user) throws SQLException, Exception {
//		 session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
	     session.save(user);
	     session.getTransaction().commit();
		
	}

	@Override
	public void updateUser(User user) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(int id) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> getAllUser() throws SQLException, Exception {
		Transaction transaction = null;
//		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
		List<User> users = new ArrayList<User>();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<User> query = builder.createQuery(User.class);
		Root<User> root = query.from(User.class);
        query.select(root);
        Query<User> q=session.createQuery(query);
        users=q.getResultList();
		System.out.println(users.size());
//		transaction.rollback();
//		users = crit.list();
//		System.out.println(users.size());
//		session.getTransaction().commit();
        return users;
	}

	@Override
	public void deleteUser(User user) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

}
