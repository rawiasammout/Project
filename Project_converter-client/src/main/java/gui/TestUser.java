package gui;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.TypeOfUser;
import persistence.User;
import services.ServiceUserRemote;

public class TestUser {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context context = new InitialContext();
		ServiceUserRemote service = (ServiceUserRemote) context
				.lookup("Project_converter-ear/Project_converter-ejb/ServiceUser!services.ServiceUserRemote");
		User us1 = new User();
		us1.setName("rawia");
		us1.setLastname("sammout");
		us1.setLogin("rawiasammout");
		us1.setPassword("mypassword");
		us1.setType(TypeOfUser.ADMIN);
		service.addUser(us1);
		User us2 = new User();
		us2.setLogin("anwer");
		us2.setPassword("anwerpassword");
		us2.setName("Anouar");
		us2.setLastname("farah");
		us2.setType(TypeOfUser.USER);
		service.addUser(us2);
		User us3 = new User();
		us3.setLogin("mosab");
		us3.setPassword("mosabpassword");
		us3.setName("Mosab");
		us3.setLastname("benjlie");
		us3.setType(TypeOfUser.USER);
		service.addUser(us3);
		List<User> users = service.showAllUsers();
		for (User u : users) {
			System.out.println(u.getName()+" "+ u.getLastname());

		}

	}

}
