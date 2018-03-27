package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.File;

/**
 * Session Bean implementation class ServiceFile
 */
@Stateless
public class ServiceFile implements ServiceFileRemote, ServiceFileLocal {

	@PersistenceContext
	private EntityManager e;
    public ServiceFile() {
    }

	@Override
	public void deleteFile(File file) {
		e.remove(file);
	}

	@Override
	public File showFile(String name) {
		return 	e.find(File.class, name);
	}

	@Override
	public void updataFile(File file) {
		e.merge(file);
		
	}

	@Override
	public List<File> showAllFile() {
		// TODO Auto-generated method stub
		String rqt = "SELECT f FROM File  f";
		Query query = (Query) e.createQuery(rqt);
		return query.getResultList();
		
	}

	@Override
	public void addFile(File file) {
		e.persist(file);
		
	}

}
