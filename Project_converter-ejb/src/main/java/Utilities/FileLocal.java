package Utilities;

import java.util.List;

import javax.ejb.Local;

@Local
public interface FileLocal {

	void deleteFile(File file);
	File convertFile(File file);
	void saveFile(File file); 
	File downloadFile(File file);
}
