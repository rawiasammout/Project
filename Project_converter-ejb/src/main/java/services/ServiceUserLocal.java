package services;

import java.util.List;

import javax.ejb.Local;

import persistence.File;
import persistence.User;

@Local
public interface ServiceUserLocal {


	public void deleteUser(User user);
	public User showUser(String name);
	public void updataUser(User user);
	public List<User> showAllUsers();
	public void addUser(User user);
}
