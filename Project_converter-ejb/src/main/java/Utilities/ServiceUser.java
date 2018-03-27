package Utilities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	public void update_password(String password) {
		// TODO Auto-generated method stub
		e.merge(password);
		
	}

	@Override
	public void update_login(String login) {
		// TODO Auto-generated method stub
		e.merge(login);
	}

	@Override
	public void add_login(String login) {
		// TODO Auto-generated method stub
		e.persist(login);
	}

	@Override
	public void add_password(String password) {
		// TODO Auto-generated method stub
		e.persist(password);
	}
   
	

}
