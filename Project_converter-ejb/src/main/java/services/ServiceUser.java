package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.User;

/**
 * Session Bean implementation class ServiceUser
 */
@Stateless

public class ServiceUser implements ServiceUserRemote, ServiceUserLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager e;
    public ServiceUser() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		e.remove(user);
	}
	@Override
	public User showUser(String name) {
		// TODO Auto-generated method stub
		return e.find(User.class, name);
		
	}
	@Override
	public void updataUser(User user) {
		// TODO Auto-generated method stub
		e.merge(user);
		
	}
	@Override
	public List<User> showAllUsers() {
		// TODO Auto-generated method stub
		String rqt = "SELECT u FROM User  u";
		Query query = (Query) e.createQuery(rqt);
		return query.getResultList();
			}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		e.persist(user);
		
	}

}
