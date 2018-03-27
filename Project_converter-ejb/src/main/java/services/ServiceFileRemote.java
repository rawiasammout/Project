package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.File;

@Remote
public interface ServiceFileRemote {
	public void deleteFile(File file);
	public File showFile(String name);
	public void updataFile(File file);
	public List<File> showAllFile();
	public void addFile(File file);
}
