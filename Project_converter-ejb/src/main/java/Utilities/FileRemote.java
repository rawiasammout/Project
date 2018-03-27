package Utilities;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface FileRemote {
	void deleteFile(File file);
	File convertFile(File file);
	void saveFile(File file); 
	File downloadFile(File file);
}
