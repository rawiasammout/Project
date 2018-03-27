package persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FileIn
 *
 */
@Entity

public class FileIn  extends File implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FileIn() {
		super();
	}

	public FileIn(int id, String name, String type) {
		super(id, name, type);
		// TODO Auto-generated constructor stub
	}
	
   
}
