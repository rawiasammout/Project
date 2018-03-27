package gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import persistence.File;
import services.ServiceFileRemote;

public class TestFile {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context context = new InitialContext();
		ServiceFileRemote service= (ServiceFileRemote) context.lookup("Project_converter-ear/Project_converter-ejb/ServiceFile!services.ServiceFileRemote");
		 File f1=new File();
		 f1.setName("Document1");
		 f1.setType("xslt");
		 service.addFile(f1);
		 
		 File f2=new File();
		 f2.setName("Doc2");
		 f2.setType("docs");
		 service.addFile(f2);
		 File f3=new File();
		 f3.setName("Doc3");
		 f3.setType("csv");
		 service.addFile(f3);
		 
		 
	}

}
