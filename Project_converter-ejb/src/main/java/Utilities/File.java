package Utilities;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 * Session Bean implementation class File
 */
@Stateless
@LocalBean
public class File implements FileRemote, FileLocal {

    /**
     * Default constructor. 
     */
	private EntityManager e;
    public File() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void deleteFile(File file) {
		// TODO Auto-generated method stub
		e.remove(file);
	}

	@Override
	public File convertFile(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFile(File file) {
		// TODO Auto-generated method stub
		e.persist(file);
		
	}

	@Override
	public File downloadFile(File file) {
		// TODO Auto-generated method stub
		return null;
	}

}
