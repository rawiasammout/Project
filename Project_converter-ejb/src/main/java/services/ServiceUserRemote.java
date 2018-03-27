package services;

import java.util.List;

import javax.ejb.Remote;

import persistence.User;

@Remote
public interface ServiceUserRemote {
	public void deleteUser(User user);
	public User showUser(String name);
	public void updataUser(User user);
	public List<User> showAllUsers();
	public void addUser(User user);
}
