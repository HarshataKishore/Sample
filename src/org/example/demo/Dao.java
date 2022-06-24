package org.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	
	public static  void main(String[] args)
	{
		Student s = new Student();
		s.setName("Harshata");
		s.setBranch("CSE");
     Configuration conf = new Configuration();
     conf.configure();
     SessionFactory sef = conf.buildSessionFactory();
     Session ses = sef.openSession();
     Transaction tr = ses.beginTransaction();
     ses.save(s);
     tr.commit();
     ses.close();
	}
}


