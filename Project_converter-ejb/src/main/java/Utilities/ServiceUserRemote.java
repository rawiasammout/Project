package Utilities;

import javax.ejb.Remote;

@Remote
public interface ServiceUserRemote {
	public void update_password(String password);
	public void update_login(String login);
	public void add_login(String login);
	public void add_password(String password);
	
}
