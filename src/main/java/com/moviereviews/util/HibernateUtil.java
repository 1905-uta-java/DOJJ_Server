package com.moviereviews.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sf;
	private static StandardServiceRegistry ssr;
	
	private static SessionFactory getSessionFactory() {
		if(sf == null) {
			ssr = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources mds = new MetadataSources(ssr);
			Metadata md = mds.getMetadataBuilder().build();
			sf = md.getSessionFactoryBuilder().build();
		}
		return sf;
	}
	
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
	
	public static void closeSessionFactory() {
		if(sf == null) {
			return;
		}
		
		sf.close();
	}
}
