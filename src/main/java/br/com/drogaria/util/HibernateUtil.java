package br.com.drogaria.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory factory;
	
	public static SessionFactory getSession() {
		try {
			if(factory == null) {
				Configuration config = new Configuration().configure();
				ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
				factory = config.buildSessionFactory(service);
			}
			
		}catch(Throwable e) {
			e.printStackTrace();;
		}
		return factory;
	}
}
