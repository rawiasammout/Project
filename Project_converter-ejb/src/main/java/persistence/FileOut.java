package persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FileOut
 *
 */
@Entity

public class FileOut  extends File implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FileOut() {
		super();
	}

	public FileOut(int id, String name, String type) {
		super(id, name, type);
		// TODO Auto-generated constructor stub
	}
	
   
}
