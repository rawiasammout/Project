package Utilities;

import javax.ejb.Local;

@Local
public interface ServiceUserLocal {
	public void update_password(String password);
	public void update_login(String login);
	public void add_login(String login);
	public void add_password(String password);
}
